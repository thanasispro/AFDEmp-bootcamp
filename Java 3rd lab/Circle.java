public class Circle{
     
		 		  
		 		  

  
		  private int x; 
		  private int y;
		  private int r;  
	  
		  Circle() {
			  this.x=3;
			  this.y=2;
			  this.r=4;
		      }
		  
		  
		  public void setX(int x) {
			  this.x=x;
			  }
		  public int getX() { 
			  return this.x;
			  }
		  public void setY(int y) {
			  this.y=y;
			  }
		  public int getY() { 
			  return this.y;
			  }
		  public void setR(int r) {
			  this.r=r;
			  }
		  public int getR() { 
			  return this.r;
			  }
		  public void myPrint(){
			  System.out.print("I'm a circle at point ("+x+","+y+") with radius "+r);
		      }
			  
		  
}			  
	  


public class TestCircle{
	public static void main(String[] args) {
			
			Circle c1 = new Circle();	
			c1.setX();
			c1.setY();
			c1.setR(); 
			
		}
}		

		

