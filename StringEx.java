package javacore;

public class StringEx {

	public static void main(String[] args) 
	{
       String str1 = "deloitte";
       System.out.println("length"+str1.length());
       System.out.println(str1.lastIndexOf('i'));
       System.out.println(str1.charAt(5));
       System.out.println(str1.isEmpty());
       System.out.println(str1.substring(3));
       System.out.println(str1.substring(3,7));
       System.out.println(str1.toUpperCase());
       System.out.println(str1.concat("hyderabad"));
       System.out.println(str1);
       System.out.println(str1.compareTo("deloitte"));
       System.out.println(str1.equals("Deloitte"));
       
       

	}

}
