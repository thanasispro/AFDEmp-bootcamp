public class Library {
	private Book[] books;
	
	public Library() {
		}
	
	public Library(Book[] books) {
        this.books = books;
        }
        
     public void setBooks(Book[] books) {
        this.books = books;
        }
        
     public Book[] getBooks() {
        return this.books;
        }
        
     public void printAvailableBooks() {
        int availableBookCounter = 0;
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBookCounter++;
                System.out.println(availableBookCounter + " " + book.getTitle());
            }
        }
    }
    
      public void printBookDetails(String bookTitle) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                System.out.println(book.toString());
                found = true;
            }
        }
        
       if (!found) {
            System.out.println(bookTitle + " not found!");
        }
    }
      public void printBookFromAuthor(String authorName) {
        boolean found = false;
        for (Book book : books) {
            if (book.hasAuthor(authorName)) {
                System.out.println(book.toString());
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No books from " + authorName + " found!");
        }
    }
}
