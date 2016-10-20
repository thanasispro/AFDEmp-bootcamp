import java.util.ArrayList;

public class AuthorList {
	ArrayList<Author> authors;
	
	AuthorList(Author[] authorsarray){
		this.authors=new ArrayList<>();
		
		for(int i=0; i<authorsarray.length; i++ )
			this.addAuthorsToList(authorsarray[i]);
			}
	
	public void addAuthorsToList(Author a){
		this.authors.add(a);
	}
	public int getSizeOfMyAuthorList(){
		return this.authors.size();
	}
	
	public void addAuthor(Author a){
		this.authors.add(a);
	}
    
	public Author getAuthor(String name){
		for (int i=0; i<this.authors.size();i++)
			if (this.authors.get(i).getName().equals(name))
				return this.authors.get(i);
		System.out.println("Author "+name+"not found in the author");
		return null;	
	}
	
	
	
	

}
