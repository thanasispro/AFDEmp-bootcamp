import java.util.Scanner;

public class Pyex4{

	public static void main(String args[]){
        		System.out.print("a=:");
                Scanner proto = new Scanner(System.in);
                int a = proto.nextInt();
                System.out.print("b=:");
                Scanner deutero = new Scanner(System.in);
                int b = deutero.nextInt();
                System.out.print("c=");
                Scanner trito = new Scanner(System.in);
                int c = trito.nextInt();
                double k= Math.pow(b,2) - 4*a*c;
                if (k>0){
					double x1=(-b + Math.sqrt(k))/(2*a);
					double x2=(-b - Math.sqrt(k))/(2*a);
					System.out.print("The solutions of quadratic equation is:");
					System.out.println();
					System.out.print("x1=");
                    System.out.printf("%.2f",x1);
					System.out.println();
					System.out.print("x2=");
                    System.out.printf("%.2f",x2);
				}else{
					System.out.printf("You have no real-valued solutions for this equation");
				}
		}
}
