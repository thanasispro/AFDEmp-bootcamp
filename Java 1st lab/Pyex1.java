public class Pyex1{
	
	public static void main(String args[]){
	int n=9;
    for (int i=1; i<=n; i++) {
	       
	       for(int k= 9-i; k>=1; k--){
			   
			   
			   System.out.print("0");
			
		   }

    System.out.println(new String(new char[i]).replace("\0", i+""));
    } 
 }
}
