package JavaCore;

public class LibraryDetails extends StudentExam {

	public LibraryDetails(int regno, String stdname, String group, int sub1, int sub2,String booksIssued) {
		super(regno, stdname, group, sub1, sub2);
		this.booksIssued=booksIssued;
		// TODO Auto-generated constructor stub
	}
	private String booksIssued;
	private int sub1;
	private int sub2;
	
	public void output(){
		int total= sub1+sub2;
		System.out.println(regno+stdname+group+total+booksIssued);
	}

	public static void main(String[] args) {
		LibraryDetails details = new LibraryDetails(444,"Yasaswi","EEE",95,90,"Concepts of C");
		details.display();
		details.output();
		// TODO Auto-generated method stub

	}

}
