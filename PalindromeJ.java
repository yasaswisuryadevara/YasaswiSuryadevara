package javacore;

public class PalindromeJ {
	
	public static void main(String[] args) {
		String name = args[0];
		StringBuffer sb1 = new StringBuffer(name);
		sb1.reverse();
		if(sb1.toString().equals(name))
			System.out.println("it is a palindrome");
		else
			System.out.println("Not a palindrome");
		
		
		
	}

}
