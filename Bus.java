package JavaCore;

public class Bus implements Vehicle {

	public static void main(String[] args) {
		Vehicle bus= new Bus();
		bus.engines();
		bus.wheels();

	}

	@Override
	public void wheels() {
		System.out.println("the no. of wheels is 6");
		
	}

	@Override
	public void engines() {
		System.out.println("the no. of engines is 1");
		
	}

}
