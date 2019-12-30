package JavaCore;

public class ClassOneApplication extends ClassOne{
	

	public ClassOneApplication(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ClassOne one = new ClassOneApplication(6,7);
		one.output();
	}

	@Override
	void output() {
		System.out.println("Helllooooooooo");
		
	}

}
