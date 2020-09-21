package PR_5;

import java.util.Scanner;

public class Task_5 {
	public static int digitsSum(int number) {
		if (number < 10) {
			return number;
		}
		return number % 10 + digitsSum(number / 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(digitsSum(sc.nextInt()));
	}
}
