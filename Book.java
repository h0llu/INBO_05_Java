package Book_Task;

public class Book {
	private String title;
	private int pages;

	public Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}

	public Book(String title) {
		this.title = title;
		this.pages = 100;
	}

	public Book() {
		this.title = "Nothingness";
	}

	public String getTitle() {
		return title;
	}

	public int getPages() {
		return pages;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "The book title is " + title + ". It has " + pages + " pages";
	}
}
