class Circle{
     
		  private int x; 
		  private int y;
		  private int r;  
	      
	      
	      
	      public static final double pi=3.1415;
		  
		  
		  Circle() {
			  this.x=3;
			  this.y=2;
			  this.r=4;
		      }
		      
		  Circle(int x,int y){
			  this.x=x;
			  this.y=y;
			  this.r=4;
		      }
		      
		  Circle(int x,int y,int r){
			  this.x=x;
			  this.y=y;
			  this.r=r;
		      }
		  
		  private static int count;
		  
		  
		  public int number_of_circles(){
			  count+=1;
			  return count;
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
			  System.out.println("I'm a circle at point ("+x+","+y+") with radius "+r);
		      }
		  public void calculateArea(){
			  double area=pi*this.r+this.r;
		      }  
		  public void calculatePerimeter(){
			  double perimeter=2*pi*this.r;
		      }  
		  public boolean cocentric(Circle c,Circle s){
			  boolean equalty;
			  if (c.getX()==s.getX() & c.getY()==s.getY()){
				  equalty= true;
			      }else{
				  equalty= false;
				  }
				  
				 
			      if ( equalty == true) {
                  System.out.println("it's true");
                  }else {
                  System.out.println("it's false");
                  }
                  
                  return equalty;
		     }
		  
			 
}			  
	  


public class TestCircle{
	public static void main(String[] args) {
			
			Circle c1 = new Circle();	
			c1.setX(4);
			c1.setY(8);
			c1.setR(3); 
			c1.myPrint();
			Circle c2 = new Circle(3,3);
			c2.myPrint();
			c2.calculateArea();
			c2.calculatePerimeter();
			
			Circle c3 = new Circle(1,1,1);
			c3.myPrint();
			c3.calculateArea();
			c3.calculatePerimeter();
			


			Circle new1 =new Circle(4,3,5);
			Circle new2= new1;
			new1.myPrint();
			new2.myPrint();
			
			Circle test=new Circle();
			
		    test.cocentric(c2,new1);
		    
		    
		    
		    
		    System.out.println("c1 count is " +  c1.number_of_circles());
		  	
			
			
			
			
			
		}
}	
