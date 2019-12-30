package JavaCore;

public class Student {
	protected static int regno;
	protected static String stdname;
	protected static String group;
	
	public void display(){
		System.out.println(regno+stdname+group);
		
	}

	public Student(int regno, String stdname, String group) {
		super();
		Student.regno = regno;
		Student.stdname = stdname;
		Student.group = group;
	}
	
	}
	
	
