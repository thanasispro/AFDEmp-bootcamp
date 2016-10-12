import java.util.Scanner;

public class Pyex3{

	public static void main(String args[]){
        		System.out.print("The side a is:");
                Scanner sidea = new Scanner(System.in);
                double a = sidea.nextInt();
                System.out.print("The side b is:");
                Scanner sideb = new Scanner(System.in);
                double b = sideb.nextInt();
                System.out.print("The side c is:");
                Scanner sidec = new Scanner(System.in);
                double c = sidec.nextInt();
                double k=(a+b+c)*(b-a+c)*(a-b+c)*(a+b-c);
                if (k>=0){
					double n= 0.25 *Math.sqrt(k);
					System.out.print("The area is:");
					System.out.printf("%.5f",n);
				}else{
					System.out.print("this sides can't make a triangle, please check again!");
				}


                
                
			}
}
