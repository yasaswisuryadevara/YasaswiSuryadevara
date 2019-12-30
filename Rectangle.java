package JavaCore;

public class Rectangle extends Shape {

	// TODO Auto-generated constructor stub
	public Rectangle(int length, int breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}

	void area() {
		int rectangularArea = (int) (length * breadth);
		System.out.println("Area of the Rectangle is" + (rectangularArea));

	}

	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		int breadth = Integer.parseInt(args[1]);

		Shape rectangle = new Rectangle(length,breadth);
	     rectangle.area();

	}
}
