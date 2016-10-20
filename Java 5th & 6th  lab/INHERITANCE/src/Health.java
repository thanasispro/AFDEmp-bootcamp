
public class Health extends Insurance {
	
	private int expence;
	Health(String fname,String lname,String sex,int year,int idc,int dur){
		super(fname, lname, sex, year, idc, dur);
		}
	public int getExpence() {
		return expence;
	}
	public void setExpence(int expence) {
		this.expence = expence;
	}
	
	public int calculateExpence(){
		if(getSex()=="female")
		return 100+7*calculateAge();
		else
		return 100+7*calculateAge()+50;
	}
	
	
	public int calculateAge(){
		return 2016-getYear();
	      }
	
	public void printHealth(){
		System.out.print("|||        CUSTOMER'S INFO        |||\n\nID:"+id+"\nName:" + getFname() + " "
	            + getLname()+"\nBirth year:"+getYear()+"\nSex:"+getSex()+"\n"+"Insurance code:"+getIdc()+
	            "\nExpence:"+calculateExpence()+"\n");
	}
	
}
