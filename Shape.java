package JavaCore;

public abstract class Shape {
	protected int length;
	protected int breadth;
	protected double radius;
	final double pi=3.14;
	public Shape(int length, int breadth) {
		super();
		this.length = (int) length;
		this.breadth = (int) breadth;
	}
	public Shape(double radius){
		this.radius=radius;
		
	}
	
		// TODO Auto-generated constructor stub
	
	abstract void area();

}
