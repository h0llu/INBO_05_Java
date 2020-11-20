package Task4;

import Task4.Expression.ExpressionParser;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String function = "";
		double x, y, z, result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("f(x, y, z) =  ");
		function = scanner.nextLine();
		System.out.print("x = ");
		x = scanner.nextDouble();
		System.out.print("y = ");
		y = scanner.nextDouble();
		System.out.print("z = ");
		z = scanner.nextDouble();
		try {
			result = new ExpressionParser().parse(function).evaluate(x, y, z);
		} catch (Exception e) {
			System.out.println(e.toString());
			System.exit(1);
		}
		System.out.println("f(" + x + ", " + y + ", " + z + ") = " + result);
	}
}