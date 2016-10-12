import java.util.Scanner;
public class Pyex2_2{
	public static void main(String args[]){
		System.out.print("PLEASE ENTER THE BINARY NUMBER:");
		Scanner user_input = new Scanner(System.in);
		int a = user_input.nextInt();
		int len = Integer.toString(a).length();
		int[] parrity = new int[len];
		int sum1=0;
		int sum2=0;
		for (int i= 0; i < len; i++) {
         parrity[i] = a % 10;
         a /= 10; 
         }
		
		for (int i= 0; i < len-1; i++) {
         if(parrity[i]==1){
			 sum1++;
            }
          System.out.println(parrity[i]);
         }
         
         for (int i= 0; i < len; i++) {
          if(parrity[i]==1){
			 sum2++;
		 }
         }
         
         System.out.println(sum1);
         System.out.println(sum2);

         if ( sum1 % 2 == 0) {
			 if(sum1 ==sum2) {
			 System.out.println("Parity check OK");
			 
			 
		    } else {
		      System.out.println("Parity check not OK");
		      }
		  }
		  if (sum1 % 2 !=0){
			 if(sum2 == sum1+1){
			 System.out.println("Parity check OK");
			 
			 
		    } else {
		      System.out.println("Parity check not OK");
		      }
          }
   }
}
