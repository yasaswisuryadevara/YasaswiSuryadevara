package JavaCore;

public class Aeroplane implements Vehicle{

	public static void main(String[] args) {
		Vehicle aeroplane= new Aeroplane();
		aeroplane.engines();
		aeroplane.wheels();

	}

	@Override
	public void wheels() {
		System.out.println("the no. of wheels is 3");
		
	}

	@Override
	public void engines() {
		System.out.println("the no. of engines is 2");
		
	}

}
