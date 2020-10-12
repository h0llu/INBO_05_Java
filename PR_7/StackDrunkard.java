package PR_7;

import java.util.Stack;

public class StackDrunkard {
	private static void push_back(Stack<Integer> player, Integer element) {
		Stack<Integer> buffer = new Stack<>();
		while (!player.isEmpty()) {
			buffer.push(player.pop());
		}
		player.push(element);
		while (!buffer.isEmpty()) {
			player.push(buffer.pop());
		}
	}

	public static String playDrunkard(Integer[] arr1, Integer[] arr2) {
		Stack<Integer> player1 = new Stack<>();
		Stack<Integer> player2 = new Stack<>();
		for (int i = arr1.length - 1; i >= 0; i--) {
			player1.push(arr1[i]);
			player2.push(arr2[i]);
		}
		int moves = 0;
		for (; !player1.isEmpty() && !player2.isEmpty() && moves < 106; moves++) {
			if (player1.peek() == 0 && player2.peek() == 9) {
				push_back(player1,0);
				push_back(player1, 9);
			}
			else if (player2.peek() == 0 && player1.peek() == 9) {
				push_back(player2, 9);
				push_back(player2, 0);
			}
			else if (player1.peek() > player2.peek()) {
				push_back(player1, player1.peek());
				push_back(player1, player2.peek());
			}
			else if (player2.peek() > player1.peek()) {
				push_back(player2, player1.peek());
				push_back(player2, player2.peek());
			}
			player1.pop();
			player2.pop();
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