import java.util.Scanner;


public class Bootcamp {
			public static void main(String[] args) {
			System.out.print("Enter the name of pronic numbers:");
            Scanner n1 = new Scanner(System.in);
            int number1 = n1.nextInt();
            System.out.print("Enter the name of pronic numbers:");
            Scanner n2 = new Scanner(System.in);
            int number2 = n2.nextInt();
            ele(number1,number2);
            
		
	   }
		 public static void ele(int x,int y) {
			 if (x<=y){;
				 int c=x-y;
				 int  b= (int)Math.abs(c);
				 int  m = (int) Math.sqrt(b);
				 System.out.print(m);
                
				 
			 }
			 else{
				 
				 int b=(x+y);
				 System.out.print(b);

				 
			 }
		}
	
  }
 

		
			
