
import java.util.Scanner;
public class Pyex1_2{
	public static void main(String args[]){
		System.out.print("Enter Tax Identification Number:");
		Scanner user_input = new Scanner(System.in);
		int a = user_input.nextInt();
		
	
	     int c=0;
         int len = Integer.toString(a).length();
         int[] iarray = new int[len];
         for (int i= 0; i < len; i++) {
         iarray[i] = a % 10;
         a /= 10; 
         }
	     
	     
	     for (int i= 1; i < len; i++){
			 c += iarray[i]* (Math.pow(2,i));
		 }
	     
	     int p=c % 11;
	     int last= p % 10;
	     
	     if (iarray[0]==last){
			 System.out.println("Tax Identification Number valid.");
			}else {
				System.out.println("Tax Identification Number NOT valid.");
	         }
	     
    }
}



