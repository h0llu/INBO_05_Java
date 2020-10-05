package PR_6;

import java.util.Comparator;

public class SortingStudentsByGPATask2 implements Comparator<Student> {
	@Override
	public int compare(Student st1, Student st2) {
		return st1.getFinalScore() - st2.getFinalScore();
	}

	public static void quickSort(Student[] list, Comparator comp, int low, int high) {
		if (list.length == 0)
			return;
		if (low >= high)
			return;

		int mid = low + (high - low) / 2;
		int i = low,
			j = high;
		while (i <= j) {
			while (comp.compare(list[i], list[mid]) < 0) {
				i++;
			}

			while (comp.compare(list[j], list[mid]) > 0) {
				j--;
			}

			if (i <= j) {
				Student temp = list[i];
				list[i] = list[j];
				list[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(list, comp, low, j);
		}
		if (high > i) {
			quickSort(list, comp, i, high);
		}
	}

	public static void main(String[] args) {
		Student[] st = new Student[5];
		st[0] = new Student(14, 76);
		st[1] = new Student(75, 100);
		st[2] = new Student(0, 56);
		st[3] = new Student(3, 94);
		st[4] = new Student(9399, 60);
		SortingStudentsByGPATask2 comp = new SortingStudentsByGPATask2();
		quickSort(st, comp, 0, st.length - 1);
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
	}
}