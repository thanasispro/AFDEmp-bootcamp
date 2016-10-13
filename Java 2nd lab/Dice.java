public class Dice{
	public static void main(String[] args) {
	   
	   
      rolling();
		
	
     }
    public static void rolling(){
	               int sum1=0;
		       int x1=0;
		       int x2=0;
		    
		    while(x1!=1 || x2!=1){
		       x1 = (int)(Math.random()*6) + 1;
		       x2 = (int)(Math.random()*6) + 1;
		       sum1++;
		       }
	  System.out.print(sum1);
       
	}
}
	
	
	

