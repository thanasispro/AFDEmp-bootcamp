

public class BootCampCandidates {
	
	//Create three private fields a name a surname and age
	public String name;
	public String surname;
	public int age;
	
	//Create a constructor that receives three arguments and initializes the variables
    
    public BootCampCandidates(String name,String surname,int age){
    	this.name=name;
    	this.surname=surname;
    	this.age=age;
    	}
   
  //Create getters and setters for all your variables (six in total methods needed)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	 
    
	
	//Create a method toString that returns the name surname and age of the candidate
	public String toString(){
		return "Name: "+ getName()+
				"\nSurname: "+getSurname()+
				"\nAge: "+getAge()+"\n";
		
			     
	}
	
	 

}
