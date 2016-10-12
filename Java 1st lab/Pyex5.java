public class Pyex5{

	public static void main(String args[]){
		int i=1;
		System.out.print(i);
		System.out.println();
		double sum=(double) i;
		for(int k=2;k<6;k++){
			double n = 1.0/k;
			sum =sum + n ;
			System.out.printf("%.11f",sum);
			System.out.println();
		}
	}
}
	
