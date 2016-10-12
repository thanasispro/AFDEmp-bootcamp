import java.util.Scanner;

public class Pyex6{

	public static void main(String args[]){
        		System.out.print("Enter the name of triangle numbers:");
                Scanner number = new Scanner(System.in);
                int num = number.nextInt();
                int sum=0;
                for (int k=1;k <=num; k++){
					sum += k;
					System.out.print(sum);
					System.out.print(" ");
					
				}
		}
		
}
