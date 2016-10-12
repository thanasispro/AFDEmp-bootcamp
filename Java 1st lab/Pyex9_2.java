import java.util.Scanner;
public class Pyex9_2{
	public static void main(String args[]){
		   String s;
		   Scanner in = new Scanner(System.in);
           System.out.println("Enter a string");
           s = in.nextLine();
           System.out.print("ENTER THE NUMBER OF SHIFT POSITIONS:");
		   Scanner user_input = new Scanner(System.in);
		   int a = user_input.nextInt();
		   
		   if (a>26){
			   a=  a%26;}
		   
		   char[] ascii = s.toCharArray();

           for(char ch:ascii){
		   int c=(int)ch+a;
		     if(c<=90){
				 System.out.print((char)c);
			 }else{
				 int k=c-90;
				 int n= 64+k;
				 System.out.print((char)n);
			  }
               
           }   

		   
	      
	      
		
		
   }
}
