

public class Insurance extends Customer {
	
	private int idc;
	private int dur;
	public int inscost;
	
	
	Insurance(String fname,String lname,String sex,int year,int idc,int dur){
		super( fname, lname, sex, year);
		this.idc=idc;
		this.dur=dur;
	}
	
	
	public int getIdc() {
		return idc;
	}
	public void setIdc(int idc) {
		this.idc = idc;
	}
	
	
	public String toString(){
		return "Insurance code:"+this.idc+
	            "/nDuration"+this.dur;
	}
	
	public int insurance_cost(){
		this.inscost=100;
		return this.inscost;
		}
	
	public String print_id(int idc){
		return "\nInsurance code:"+this.idc+
	            "/nDuration"+this.dur;
	}
	
	public void printIn(){
		System.out.print("|||        CUSTOMER'S INFO        |||\n\nID:"+id+"\nName:" + getFname() + " "
	            + getLname()+"\nBirth year:"+getYear()+"\nSex:"+getSex()+"\n"+"Insurance code:"+this.idc+
	            "\nDuration:"+this.dur+"\n");
	}
	public int getDur() {
		return dur;
	}
	public void setDur(int dur) {
		this.dur = dur;
	}

	
	
	
	

}
