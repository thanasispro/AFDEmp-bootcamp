public class Librarian {
	private Library library;
	
	public Librarian(){}

	
	public Librarian(Library library) {
		this.library = library;
	}
	
	public void setLibrary(Library library) {
		this.library = library;
	}
	
	public Library getLibrary() {
		return this.library;
	}
	
	public void findMeBooksFromAuthor(String authorName) {
		this.library.printBookFromAuthor(authorName);
	}
	
	public void findMeAvailableBooks() {
		this.library.printAvailableBooks();
	}
	
	public void findMeBook(String bookTitle) {
		this.library.printBookDetails(bookTitle);
	}
	
	
	}
