package javacore;

public class CommandLineName {

	public static void main(String[] args) {
		 String name = args[0];
		 System.out.println(name);
		 
		 for(int i=0;i<name.length();i++)
		 {
		System.out.println(name.charAt(i));
		 }
		

	}

}
