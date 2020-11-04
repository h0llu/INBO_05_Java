package Student;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private final int idNumber;
	private final int finalScore;
	private final String fullName;

	public Student(String fullName, int idNumber, int finalScore) {
		this.idNumber = idNumber;
		this.finalScore = finalScore;
		this.fullName = fullName;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public String getFullName() {
		return fullName;
	}

	@Override
	public String toString() {
		return "Student{" +
				"idNumber=" + idNumber +
				", finalScore=" + finalScore +
				", fullName='" + fullName + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return idNumber == student.idNumber &&
				finalScore == student.finalScore &&
				fullName.equals(student.fullName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idNumber, finalScore, fullName);
	}

	@Override
	public int compareTo(Student student) {
		return this.finalScore - student.finalScore;
	}
}
