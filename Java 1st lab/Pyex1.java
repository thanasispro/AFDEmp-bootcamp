public class Pyex1{
	
	public static void main(String args[]){
	int n=9;
    for (int i=1; i<=n; i++) {
	       int k= 9-i;
	       do{
			   
			   k=k-1;
			   System.out.print("0");
			
		   }while (k>=1);

    System.out.println(new String(new char[i]).replace("\0", i+""));
    } 
 }
}
