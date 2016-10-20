class Book{
	private String title;
	private Author author;
	private final String isbn;
	private int physical_copies;
	private int available_copies;
	private int times_rented;
	
	public Book() {
		 this.isbn="0589544";}
	 public Book(String title, Author author, String isbn, int physical_copies,
                int available_copies, int times_rented) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.physical_copies = physical_copies;
        this.available_copies = available_copies;
        this.times_rented = times_rented;
          }
        
        public void setTitle(String title) {
        this.title = title;
            }
        public String getTitle() {
        return this.title;
            } 
        public void setAuthor(Author author) {
        this.author = author;
            }
        public Author getAuthor() {
        return this.author;
        }
        
        public String getIsbn() {
        return this.isbn;
         }
        
        public void setPhysicalCopies(int physical_copies) {
        this.physical_copies = physical_copies;
        }
        
        public int getPhysicalCopies() {
        return this.physical_copies;
          }
          
        public void setAvailableCopies(int available_copies) {
        this.available_copies  = available_copies ;
          }
          
        public int getAvailableCopies() {
        return this.available_copies;
          }
        
        public void setTimesRented(int times_rented) {
            this.times_rented = times_rented;
              }
              
            public int getTimesRented() {
            return this.times_rented;
              }  
             
            public String toString() {
            return "Title: " + getTitle() +
                   "\nAuthor: " + getAuthor().getName() +
                   "\nISBN: " + getIsbn() +
                   "\nPhysical copies: " + getPhysicalCopies() +
                   "\nAvailable copies: " + getAvailableCopies() +
                   "\nTimes rented: " + getTimesRented() +
                   "\n-------------------------------------------------------";
              }
              
             public void rentPhysicalCopy() {
                if (isAvailable()) {
                this.available_copies--;
                System.out.println("Book rented!");
                }
             } 
             public boolean isAvailable() {
                if (this.available_copies >= 1) {
                return true;
               }
                return false;
               }
               
             public boolean hasAuthor(String name) {
                if (this.author.getName().equals(name)) {
                 return true;
                }   
                 return false;
                }
        
    

}
          