package PR_6;

public class InsertionSortTask1 {
	public static void insertionSort(Comparable[] list) {
		for (int i = 1; i < list.length; i++) {
			Comparable currentElement = list[i];
			int prev = i - 1;
			while (prev >= 0 && list[prev].compareTo(currentElement) > 0) {
				list[prev + 1] = list[prev];
				list[prev] = currentElement;
				prev--;
			}
		}
	}

	public static void main(String[] args) {
		Student[] students = new Student[5];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(i - 3, 1);
		}
		insertionSort(students);
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}
}