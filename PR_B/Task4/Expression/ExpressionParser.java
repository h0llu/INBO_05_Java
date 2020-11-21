package Task4.Expression;

import Task3.Expression.Expression;
import Task4.Exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class ExpressionParser implements Parser {

	/*------------------------------------------------------------------
	 * Грамматические правила парсера LL(1)
	 *------------------------------------------------------------------*/
//
//    expression : addSubstract* END ;
//
//    addSubstract: multiplyDivide ( ( '+' | '-' ) multiplyDivide )* ;
//
//    multiplyDivide : factor ( ( '*' | '/' ) factor )* ;
//
//    factor : CONST | UNARY_MINUS CONST | VARIABLE | UNARY_MINUS VARIABLE | '(' expression ')' ;

	public TripleExpression parse(String expression) throws ParserException {
		List<Lexeme> lexemes = Lexeme.lexAnalyze(expression);
		LexemeBuffer lexemeBuffer = new LexemeBuffer(lexemes);
		return Syntax.parse(lexemeBuffer);
	}

	private enum LexemeType {
		PLUS, MINUS, MULTIPLY, DIVIDE, LEFT_BRACKET,
		RIGHT_BRACKET, VARIABLE, CONST, UNARY_MINUS, END
	}
	private static class Lexeme {
		LexemeType type;
		String value;

		public Lexeme(LexemeType type, String value) {
			this.type = type;
			this.value = value;
		}

		public Lexeme(LexemeType type, Character value) {
			this.type = type;
			this.value = value.toString();
		}

		@Override
		public String toString() {
			return "Lexeme{" +
					"type=" + type +
					", value='" + value + '\'' +
					'}';
		}



		public static List<Lexeme> lexAnalyze(String expText) throws ParserException {
			ArrayList<Lexeme> lexemes = new ArrayList<>();
			int pos = 0;
			while (pos < expText.length()) {
				char c = expText.charAt(pos);
				switch (Character.toLowerCase(c)) {
					case '(':
						lexemes.add(new Lexeme(LexemeType.LEFT_BRACKET, c));
						pos++;
						continue;
					case ')':
						lexemes.add(new Lexeme(LexemeType.RIGHT_BRACKET, c));
						pos++;
						continue;
					case '+':
						lexemes.add(new Lexeme(LexemeType.PLUS, c));
						pos++;
						continue;
					case '-':
						String lastElement = lexemes.get(lexemes.size() - 1).value;

						// UNARY_MINUS
						if (lexemes.isEmpty() ||
							lastElement.equals("+") ||
							lastElement.equals("-") ||
							lastElement.equals("*") ||
							lastElement.equals("/") ||
							lastElement.equals("("))
						{
							lexemes.add(new Lexeme(LexemeType.UNARY_MINUS, c));
						}
						// BINARY_MINUS
						else {
							lexemes.add(new Lexeme(LexemeType.MINUS, c));
						}
						pos++;
						continue;
					case '*':
						lexemes.add(new Lexeme(LexemeType.MULTIPLY, c));
						pos++;
						continue;
					case '/':
						lexemes.add(new Lexeme(LexemeType.DIVIDE, c));
						pos++;
						continue;
					case 'x':
					case 'y':
					case 'z':
						lexemes.add(new Lexeme(LexemeType.VARIABLE, c));
						pos++;
						continue;
					default:
						if (Character.isDigit(c)) {
							StringBuilder sb = new StringBuilder();
							do {
								sb.append(c);
								pos++;
								if (pos >= expText.length()) {
									break;
								}
								c = expText.charAt(pos);
							} while(Character.isDigit(c));
							lexemes.add(new Lexeme(LexemeType.CONST, sb.toString()));
						} else {
							if (c != ' ') {
								throw new ParserException("Unexpected character: " + c);
							}
							pos++;
						}
				}
			}
			lexemes.add(new Lexeme(LexemeType.END, ""));
			return lexemes;
		}
	}
	private static class LexemeBuffer {
		private int pos;
		public List<Lexeme> lexemes;

		public LexemeBuffer(List<Lexeme> lexemes) {
			this.lexemes = lexemes;
		}

		public Lexeme next() {
			return lexemes.get(pos++);
		}

		public void back() {
			pos--;
		}

		public int getPos() {
			return pos;
		}

		@Override
		public String toString() {
			return "LexemeBuffer{" +
					"lexemes=" + lexemes +
					'}';
		}
	}
	private static class Syntax {

		public static TripleExpression parse(LexemeBuffer lexemes) throws ParserException {
			return expression(lexemes);
		}

		// expression : addSubstract* END ;
		private static TripleExpression expression(LexemeBuffer lexemes) throws ParserException {
			Lexeme lexeme = lexemes.next();
			if (lexeme.type == LexemeType.END) {
				return null;
			}
			else {
				lexemes.back();
				return addSubstract(lexemes);
			}
		}

		// addSubstract: multiplyDivide ( ( '+' | '-' ) multiplyDivide )* ;
		private static TripleExpression addSubstract(LexemeBuffer lexemes) throws ParserException {
			// правило практически аналогично multiplyDivide
			// меняются только знаки и вместо factor - multiplyDivide
			TripleExpression value = multiplyDivide(lexemes);
			while (true) {
				Lexeme lexeme = lexemes.next();
				switch (lexeme.type) {
					case PLUS:
						value = new Add(value, multiplyDivide(lexemes));
						break;
					case MINUS:
						value = new Substract(value, multiplyDivide(lexemes));
						break;
					default:
						lexemes.back();
						return value;
				}
			}
		}

		// multiplyDivide : factor ( ( '*' | '/' ) factor )* ;
		private static TripleExpression multiplyDivide(LexemeBuffer lexemes) throws ParserException {
			TripleExpression value = factor(lexemes);
			// т.к. грамматикой задано, что ( '*' | '/' ) factor
			// может быть любое конечно количество, создаем бесконечный цикл
			// в котором продолжаем парсить выражение, пока не встретиться что-то
			// кроме умножения, деления и factor
			while (true) {
				Lexeme lexeme = lexemes.next();
				switch (lexeme.type) {
					case MULTIPLY:
						value = new Multiply(value, factor(lexemes));
						break;
					case DIVIDE:
						value = new Divide(value, factor(lexemes));
						break;
					default:
						lexemes.back();
						return value;
				}
			}
		}

		// factor : CONST | UNARY_MINUS CONST | VARIABLE | UNARY_MINUS VARIABLE | '(' expression ')' ;
		private static TripleExpression factor(LexemeBuffer lexemes) throws ParserException {
			Lexeme lexeme = lexemes.next();
			switch (lexeme.type) {
				case CONST:
					return new Const(Double.parseDouble(lexeme.value));
				case VARIABLE:
					return new Variable(lexeme.value);
				case UNARY_MINUS:
					Lexeme varConst = lexemes.next();
					// после унарного минуса сразу должна идти константа либо переменная
					// иначе ошибка в выражении
					if (varConst.type == LexemeType.CONST) {
						return new Negate(new Const(Double.parseDouble(varConst.value)));
					}
					else if (varConst.type == LexemeType.VARIABLE) {
						return new Negate(new Variable(varConst.value));
					}
					else {
						throw new ParserException("Unexpected " + lexeme.value
								+ "at position " + lexemes.getPos());
					}

				case LEFT_BRACKET:
					TripleExpression value = expression(lexemes);
					// после выполнения expression() "указатель"
					// должен быть на правой скобке
					lexeme = lexemes.next();
					// если его там нет, тогда забыли скобку
					if (lexeme.type != LexemeType.RIGHT_BRACKET) {
						throw new ParserException("Unexpected " + lexeme.value
								+ "at position " + lexemes.getPos());
					}
					return value;
				// если на данном этапе встречена другая лексема,
				// выражение написано неверно
				default:
					throw new ParserException("Unexpected " + lexeme.value
							+ "at position " + lexemes.getPos());
			}
		}
	}
}
