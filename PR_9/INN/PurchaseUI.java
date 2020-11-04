package INN;

import java.util.Scanner;

public class PurchaseUI {
	public static void orderingMenu() {
		String fullName;
		String INN;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Оформление покупки.");
			System.out.println("Пожалуйста, введите Ваше ФИО:");
			fullName = scanner.nextLine();
			System.out.println("Пожалуйста, введите Ваш ИНН:");
			INN = scanner.next();
			Client client = new Client(fullName, INN);
			System.out.println("Покупка завершена успешно.");
		} catch (InvalidINNException err) {
			System.out.println(err.getMessage());
		}
	}

	public static void main(String[] args) {
		orderingMenu();
	}
}