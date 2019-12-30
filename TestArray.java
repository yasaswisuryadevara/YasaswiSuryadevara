package javacore;

public class TestArray {

	public static void main(StringEx[] args) {
		int x[]= new int[5];
		int y[]= {10,34,25,67,13};
		for(int i=0;i<5;i++)
			x[i]=i+2;
		for(int i=0;i<5;i++)
			System.out.println(x[i]+""+y[i]);

	}

}
