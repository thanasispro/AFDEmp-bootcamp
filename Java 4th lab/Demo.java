class Employee{
	    public static int idcount=0;
		private String fname;   /*fname=first name ,lname=last name*/ 
		private String lname;
		private int year;    /*year of birth*/
		private int id=0;
		
	    Employee(String fname,String lname,int year) {               
			  this.fname=fname;
			  this.lname=lname;
			  this.year=year;
			  idcount++;
			  id=idcount;
		      }                
		      
		
	    public void setFname(String fname) {   /*getters setters for employees*/
			  this.fname=fname;
			  }
	    public String getFname() { 
			  return this.fname;
			  }
	    public void setLname(String Lname) {
			  this.lname=lname;
			  }
		public String getLname() { 
			  return this.lname;
			  }
		public void setYear(int year) {
			  this.year=year;
			  }
	    public int getYear() { 
			  return this.year;
			  }   
			                                  /*age calculator */
		public int calculateAge(){
			return 2016-this.year;
		      }
		     
		public String toString(){
			return "|||        Employee's info        |||\n\nID:"+id+"\nName:" + this.fname + " "
                + this.lname+"\nBirth year:"+
                this.year+"\nAge:"+calculateAge()+" years old\n";
			  }
    
}

public class Demo{
	public static void main(String[] args) {
	 Employee e1=new Employee("Thanasis","Protopapas",1987);
	 System.out.println(e1);
	 Employee e2=new Employee("Nikos","Fotakis",1985);
	 System.out.println(e2);
	 Employee e3=new Employee("Katerina","Kosti",1974);
	 System.out.println(e3);
	 Employee e4=new Employee("Marina","Epivlavi",1977);
	 System.out.println(e4);
	}
}
		
