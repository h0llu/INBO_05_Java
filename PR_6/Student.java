package PR_6;

public class Student implements Comparable<Student>{
	private int iDNumber;
	private int finalScore;

	public int getFinalScore() {
		return finalScore;
	}

	public Student(int iDNumber, int finalScore) {
		this.iDNumber = iDNumber;
		this.finalScore = finalScore;
	}

	@Override
	public int compareTo(Student st) {
		return this.iDNumber - st.iDNumber;
	}

	@Override
	public String toString() {
		return "PR_6.Student{" +
				"iDNumber=" + iDNumber +
				", finalScore=" + finalScore +
				'}';
	}
}