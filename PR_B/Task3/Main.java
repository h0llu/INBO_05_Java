package Task3;

import Task3.Expression.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите x: ");
		double x = sc.nextDouble();
		double f = new Add(
				new Substract(
						new Multiply(
								new Variable("x"),
								new Variable("x")
						),
						new Multiply(
								new Const(2),
								new Variable("x")
						)

				),
				new Const(1)
		).evaluate(x);
		System.out.println("x*x - 2x + 1 = " + f);
	}
}