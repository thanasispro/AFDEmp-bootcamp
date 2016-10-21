
public class Life extends Insurance {
	private int amount;
	private int age;
	
	Life(String fname,String lname,String sex,int year,int idc,int dur){
		super(fname, lname, sex, year, idc, dur);
		}
	
	public int calculateAge(){
		return 2016-getYear();
	      }

	public int calculateAmount(){
		return 100+5*calculateAge();
	}
	
	public int calculateExpence(){
		if(getSex()=="FEMALE")
		return 100+7*calculateAge();
		else
		return 100+7*calculateAge()+50;
	}
	
	public void printLife(){
		System.out.print("|||        CUSTOMER'S INFO        |||\n\nID:"+id+"\nName:" + getFname() + " "
	            + getLname()+"\nBirth year:"+getYear()+"\nSex:"+getSex()+"\n"+"Insurance code:"+getIdc()+
	            "\nAmount:"+calculateAmount()+"\n");
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
