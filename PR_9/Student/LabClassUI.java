package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class LabClassUI {
	private static ArrayList<Student> students;

	public static void StudentUI() {
		System.out.println("Для вывода списка команд напечатайте HELP");
		students = new ArrayList<>();
		String userInput = "";
		String command = "",
			   options = "";
		Scanner scanner = new Scanner(System.in);
		while (!userInput.equals("EXIT")) {
			userInput = scanner.nextLine();
			String[] parsed = userInput.split(" ");
			switch (parsed[0]) {
				case "ADD":
					students.add(new Student(parsed[1] + " " + parsed[2] + " " + parsed[3],
							Integer.parseInt(parsed[4]), Integer.parseInt(parsed[5])));
					break;
				case "HELP":
					help();
					break;
				case "FIND":
					find(parsed[1] + " " + parsed[2] + " " + parsed[3]);
					break;
				case "SORT":
					sort();
					break;
				case "PRINT":
					print();
					break;
				default:
					userInput = "EXIT";
			}
		}
	}

	private static void help() {
		System.out.println("ADD <ФИО студента, id, средний балл> - добавить студента в список");
		System.out.println("FIND <ФИО студента> - найти студента по ФИО в общем списке");
		System.out.println("SORT - отсортировать список студентов по среднему баллу");
		System.out.println("PRINT - вывести на экран список студентов");
		System.out.println("EXIT - выход из программы");
	}

	private static void find(String fullName) {
		System.out.println(LabClass.find(students, fullName));
	}

	private static void sort() {
		ArrayList<Comparable> comparables = new ArrayList<>();
		for (Student student : students) {
			comparables.add((Comparable) student);
		}
		LabClass.sort(comparables);
		students = new ArrayList<>();
		for (Comparable comparable : comparables) {
			students.add((Student) comparable);
		}
	}

	private static void print() {
		System.out.println(students);
	}
}
