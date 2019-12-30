      package javacore;

      public class MethodOverloading {
	void add(int x, int y){
		System.out.println("int "+(x+y));
		System.out.println();
	}
	void add(double x, double y){
		System.out.println("double "+(x+y));
	}
	void add(String x, String y){
		System.out.println("string "+(x+y));
	}
   
	public static void main(String[] args) {
		MethodOverloading methods = new MethodOverloading();
		methods.add(10.5, 20.7);

	}

}
