package Student;

public class StudentNotFoundException extends RuntimeException {
	public StudentNotFoundException(String notFoundStudent) {
		super("Student " + notFoundStudent + " not found!");
	}
}