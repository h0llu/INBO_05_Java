package PR_7;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDrunkard {
	public static String playDrunkard(Integer[] arr1, Integer[] arr2) {
		Deque<Integer> player1 = new ArrayDeque<>();
		Deque<Integer> player2 = new ArrayDeque<>();
		for (int i = 0; i < arr1.length; i++) {
			player1.add(arr1[i]);
			player2.add(arr2[i]);
		}
		int moves = 0;
		for(; !player1.isEmpty() && !player2.isEmpty() && moves < 106; moves++) {
			if (player1.peek() == 0 && player2.peek() == 9) {
				player1.add(0);
				player1.add(9);
			}
			else if (player2.peek() == 0 && player1.peek() == 9) {
				player2.add(9);
				player2.add(0);
			}
			else if (player1.peek() > player2.peek()) {
				player1.add(player1.peek());
				player1.add(player2.peek());
			}
			else if (player2.peek() > player1.peek()) {
				player2.add(player1.peek());
				player2.add(player2.peek());
			}
			player1.remove();
			player2.remove();
		}
		if (moves == 106) {
			return "botva";
		} else if (player1.isEmpty()) {
			return "second " + moves;
		} else if (player2.isEmpty()) {
			return "first " + moves;
		}
		return "";
	}
}