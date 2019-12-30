package javacore;

public class TypeCasting {

	public static void main(StringEx[] args) {
		byte b=50;
		short s=b; // implicit casting
		System.out.println(s);
		int x= 32767;
		short s1= (short) x; // explicit casting
		System.out.println(s1);

	}

}
