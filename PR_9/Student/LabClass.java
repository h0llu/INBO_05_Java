package Student;

import java.util.ArrayList;
import java.util.Arrays;

public class LabClass {
	public static void sort(ArrayList<Comparable> list) {
		sort(list, 0, list.size() - 1);
	}

	private static void sort(ArrayList<Comparable> list, int low, int high) {
		if (list.size() == 0)
			return;
		if (low >= high)
			return;

		int mid = low + (high - low) / 2;
		int i = low,
				j = high;
		while (i <= j) {
			while (list.get(i).compareTo(list.get(mid)) < 0) {
				i++;
			}

			while (list.get(j).compareTo(list.get(mid)) > 0) {
				j--;
			}

			if (i <= j) {
				Comparable temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
				i++;
				j--;
			}
		}
		if (low < j) {
			sort(list, low, j);
		}
		if (high > i) {
			sort(list, i, high);
		}
	}

	public static Student find(ArrayList<Student> students, String studentToFind)
			throws StudentNotFoundException, EmptyStringException {
		if (studentToFind.length() == 0) {
			throw new EmptyStringException();
		}
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getFullName().equals(studentToFind)) {
				return students.get(i);
			}
		}
		throw new StudentNotFoundException(studentToFind);
	}
}