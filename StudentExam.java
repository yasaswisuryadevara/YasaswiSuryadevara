package JavaCore;


public class StudentExam extends Student{

	public StudentExam(int regno, String stdname, String group,int sub1, int sub2) {
		super(regno, stdname, group);
		this.sub1=sub1;
		this.sub2=sub2;
		// TODO Auto-generated constructor stub
	}
	private static int sub1;
	private int sub2;
	public void display(){
		System.out.println("from Sub class");

	}	
	public void output(){
		int total= sub1+sub2;
		System.out.println(regno+stdname+group+total);
		
	}

	public static void main(String[] args) {
		Student student = new Student(sub1, group, group);
		StudentExam exam= new StudentExam(123,"abcdef","EEE",85,93);
	 /* exam.display();
		exam.output(); */
		student.display();
		student = exam;
		student.display();
		
		
		// TODO Auto-generated method stub

	}

}
