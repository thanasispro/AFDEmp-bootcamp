
public class Customer {
	public static int idcount=0;
	private String fname;   
	private String lname;
	private String sex;
	private int year;    
	public  int id=0;
	
    Customer(String fname,String lname,String sex,int year) {               
		  this.fname=fname;
		  this.lname=lname;
		  this.sex=sex;
		  this.year=year;
		  idcount++;
		  id=idcount;
	      }
    
    Customer(int id){
    		this.id=id;
    }

	public static int getIdcount() {
		return idcount;
	}

	public  void setIdcount(int idcount) {
		Customer.idcount = idcount;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	

	
    
	public  String toString(){
		return "|||        CUSTOMER'S INFO        |||\n\nID:"+id+"\nName:" + this.fname + " "
            + this.lname+"\nBirth year:"+this.year+"\nSex:"+this.sex;
            
		  }
	public void print(){
		System.out.print("|||        CUSTOMER'S INFO        |||\n\nID:"+id+"\nName:" + this.fname + " "
	            + this.lname+"\nBirth year:"+this.year+"\nSex:"+this.sex+"\n");
	}

}
    
	


