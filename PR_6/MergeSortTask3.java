package PR_6;

import java.util.Comparator;

public class MergeSortTask3 {

	public static Comparable[] merge(Comparable[] list1, Comparable[] list2) {
		Comparable[] merged = new Student[list1.length + list2.length];
		int list1Index = 0,
			list2Index = 0,
			i = 0;
		while (i < merged.length) {
			if (list1[list1Index].compareTo(list2[list2Index]) < 0) {
				merged[i] = list1[list1Index++];
			}
			else {
				merged[i] = list2[list2Index++];
			}
			if (list1Index == list1.length) {
				System.arraycopy(list2, list2Index, merged, ++i, list2.length - list2Index);
			}
			if (list2Index == list2.length) {
				System.arraycopy(list1, list1Index, merged, ++i, list1.length - list1Index);
			}
			i++;
		}
		return merged;
	}

	public static void main(String[] args) {
		Student[] students1 = new Student[5];
		Student[] students2 = new Student[7];
		students1[0] = new Student(0, 1);
		students1[1] = new Student(4, 4);
		students1[2] = new Student(86, 5);
		students1[3] = new Student(90, 0);
		students1[4] = new Student(409, 3);
		students2[0] = new Student(3, 5);
		students2[1] = new Student(33, 3);
		students2[2] = new Student(49, 2);
		students2[3] = new Student(77, 4);
		students2[4] = new Student(215, 5);
		students2[5] = new Student(216, 5);
		students2[6] = new Student(599, 1);
		Student[] students = (Student[]) merge(students1, students2);
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}
}
