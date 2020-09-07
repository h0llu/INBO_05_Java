package Book_Task;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("Fountainhead", 900);
		Book b2 = new Book("Tao Te Ching");
		Book b3 = new Book();

		b3.setPages(457);
		System.out.println(b3.getPages());

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
