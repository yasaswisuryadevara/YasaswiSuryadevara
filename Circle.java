package JavaCore;

public class Circle extends Shape {

	public Circle(double radius) {
		super(radius);
		
	}


	@Override
	void area(){
		double area= radius*radius* pi;
		System.out.println("Area of the circle is" + (area));
	}
		// TODO Auto-generated method stub
		
   public static void main(String args[]){
	   double radius= Double.parseDouble(args[0]);
	   Shape circle = new Circle(radius);
	   circle.area();
	   
   }
	   
   }
	
		
	


