package AuthorTask;

public class TestAuthor {
	public static void main(String[] args) {
		Author a1 = new Author("Ivan Ivanov", "ivanivanov@gmail.com", 'M');
		Author a2 = new Author("Irina Irinova", "irinairinova@gmail.com", 'F');
		Author a3 = new Author("Victor Pelevin", "unknown@gmail.com", 'U');

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		a3.setEmail("unknown@unknown.unknown");
		System.out.println(a3);
	}
}
