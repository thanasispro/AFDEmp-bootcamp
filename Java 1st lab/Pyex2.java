import java.util.Scanner;

public class Pyex2{

	public static void main(String args[]){
        		System.out.print("Enter number of 50 euro banknotes:");
                Scanner fif = new Scanner(System.in);
                int a = fif.nextInt();
                System.out.print("Enter number of 20 euro banknotes:");
                Scanner twe = new Scanner(System.in);
                int b = twe.nextInt();
                System.out.print("Enter number of 50 euro banknotes:");
                Scanner ten = new Scanner(System.in);
                int c = ten.nextInt();
                System.out.print("Enter number of 5 euro banknotes:");
                Scanner fiv = new Scanner(System.in);
                int d = fiv.nextInt();
                System.out.print("Enter number of 2 euro banknotes:");
                Scanner two = new Scanner(System.in);
                int e = two.nextInt();
                System.out.print("Enter number of 1 euro banknotes:");
                Scanner one = new Scanner(System.in);
                int f = one.nextInt();
                int sum=a*50+b*20+c*10+d*5+e*2+f*1;
                System.out.print("You have ");
                System.out.print(sum);
                System.out.print(" euros");

                
                
			}
}
