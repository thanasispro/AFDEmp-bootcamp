import java.util.Scanner;

public class Pyex7{

	public static void main(String args[]){
        		System.out.print("Enter the name of pronic numbers:");
                Scanner number = new Scanner(System.in);
                int num = number.nextInt();
                
                for (int k=1;k <=num; k++){
					int sum=k*(1+k);
					System.out.print(sum);
					System.out.print(" ");
					
				}
		}
		
}
