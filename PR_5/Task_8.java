package PR_5;

import java.util.Scanner;

public class Task_8 {
	// сравним первую половину слова со второй
	public static boolean isPalindrome(String word) {
		// первая половина слова
		String firstHalf = word.substring(0, word.length() / 2);
		// вторая половина слова
		// ceil() используется для того, чтобы при нечётном количестве букв не записывать в строку букву в середине слова
		// если в слове нечётное количество букв, то его первая половина совпадает со второй за исключением средней буквы
		String secondHalf = word.substring((int) Math.ceil(word.length() / 2), word.length());
		// используем StringBuilder для разворота второй половины слова
		secondHalf = new StringBuilder(secondHalf).reverse().toString();
		// остаётся сравнить строки
		return firstHalf.equals(secondHalf);
		// однострочник:
		// return word.substring(0, word.length() / 2).equals(new StringBuilder(word.substring((int) Math.ceil(word.length() / 2), word.length())).reverse().toString());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isPalindrome(sc.next()) ? "YES" : "NO");
	}
}
