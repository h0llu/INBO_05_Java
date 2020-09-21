package PR_5;

import java.util.Scanner;

public class Task_7 {
	public static void primeFactors(int number, int factor) {
		if (factor > number / 2) {
			System.out.println(number);
			return;
		}

		if (number % factor == 0) {
			System.out.println(factor);
			primeFactors(number / factor, factor);
		} else {
			primeFactors(number, ++factor);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		primeFactors(sc.nextInt(), 2);
	}
}
