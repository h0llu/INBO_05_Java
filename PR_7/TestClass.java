package PR_7;

public class TestClass {
	public static void testing(String correctAnswer, Integer[] arr1, Integer[] arr2) {
		System.out.println("Correct answer: " + correctAnswer);
		System.out.println(QueueDrunkard.playDrunkard(arr1, arr2).equals(correctAnswer));
		System.out.println(StackDrunkard.playDrunkard(arr1, arr2).equals(correctAnswer));
		System.out.println(DequeDrunkard.playDrunkard(arr1, arr2).equals(correctAnswer));
		System.out.println(DoubleListDrunkard.playDrunkard(arr1, arr2).equals(correctAnswer));
	}
	public static void main(String[] args) {
		Integer[] arr1 = {3, 4, 5, 7, 9};
		Integer[] arr2 = {2, 1, 6, 8, 0};
		testing("second 9", arr1, arr2);
		arr1 = new Integer[]{2, 1, 6, 8, 0};
		arr2 = new Integer[]{3, 4, 5, 7, 9};
		testing("first 9", arr1, arr2);
		arr1 = new Integer[]{1, 3, 5, 7, 9};
		arr2 = new Integer[]{2, 4, 6, 8, 0};
		testing("second 5", arr1, arr2);
		arr1 = new Integer[]{2, 4, 6, 8, 0};
		arr2 = new Integer[]{1, 3, 5, 7, 9};
		testing("first 5", arr1, arr2);
	}
}
