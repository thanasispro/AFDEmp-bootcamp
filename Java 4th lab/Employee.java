class Employee{
		private String fname;   /*fname=first name ,lname=last name*/ 
		private String lname;
		private int year;    /*year of birth*/
		
	/*	Employee() {               
			  this.fname=fname;
			  this.lname=lname;
			  this.year=year;
		      }                */
		      
		
	    public void setFname(String fname) {
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
			  
		public void calculateAge(){
			int age=2016-this.year;
			System.out.print("His/her age is "+age+" ");
		     }
		     
		public String toString(){
			return "Name of the employee.:" + this.fname + ""
                + this.lname + "who birth in"+
                + this.year ;
			}
    
		     
		 
	      
		
}
