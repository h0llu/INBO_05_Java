package PR_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StackUserInterface {
	public static ArrayList<Integer> parseCards(String cards) {
		ArrayList<Integer> intCards = new ArrayList<>();
		for (int i = 0; i < cards.length(); i++) {
			if (Character.isDigit(cards.charAt(i))) {
				intCards.add(cards.charAt(i) - '0');
			}
		}
		return intCards;
	}

	public static ArrayList<Integer> input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter player's cards (i.e. 9, 6, 4, 5, 3): ");
		ArrayList<Integer> player = parseCards(sc.nextLine());
		try {
			if (player.size() != 5) {
				throw new IllegalArgumentException("Player must have five cards");
			}
			Set<Integer> set = new HashSet<>(player);
			if (set.size() < player.size()) {
				throw new IllegalArgumentException("Player must have non-recurring cards");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		return player;
	}

	public static void checkEquals(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		ArrayList<Integer> arr = new ArrayList<>(arr1);
		arr.retainAll(arr2);
		try {
			if (arr.size() != 0) {
				throw new IllegalArgumentException("Players must have non-recurring cards");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}

	public static void menu() {
		System.out.println("Drunkard game\n" +
				"There are two players with 5 non-recurring cards each");
		ArrayList<Integer> player1 = input();
		ArrayList<Integer> player2 = input();
		checkEquals(player1, player2);
		System.out.println(StackDrunkard.playDrunkard(player1.toArray(new Integer[0]),
													  player2.toArray(new Integer[0])));
	}

	public static void main(String[] args) {
		menu();
	}
}
