package JavaCore;

public interface Arithmetic {
	void add();
	default void output(){
	System.out.println("it is default method");
	}
}
