package PR_5;

import java.util.Scanner;

public class Task_6 {
	public static boolean isPrime(int number, int divisor) {
		if (number == 2) {
			return true;
		}
		else if (number % divisor == 0) {
			return false;
		}
		else if (divisor * divisor < number) {
			return isPrime(number, divisor + 1);
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isPrime(sc.nextInt(), 2) ? "YES" : "NO");
	}
}
