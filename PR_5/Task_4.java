package PR_5;

import java.util.Scanner;

public class Task_4 {
	public static int digitsSum(int number) {
		if (number < 10) {
			return number;
		}
		return number % 10 + digitsSum(number / 10);
	}

	public static int numbers(int k, int d) {
		int firstNumber =(int) Math.pow(10, (k - 1));
		return recursion(firstNumber, k, d);
	}

	public static int recursion(int number, int k, int d) {
		if (number == Math.pow(10, k)) {
			return 0;
		}
		if (digitsSum(number) == d) {
			return 1 + recursion(number + 1, k, d);
		} else {
			return recursion(number + 1, k, d);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(numbers(sc.nextInt(), sc.nextInt()));
	}
}