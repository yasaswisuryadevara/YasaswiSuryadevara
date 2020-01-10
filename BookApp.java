package inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class BookApp {

	public static void main(String[] args) {
		AnnotationConfiguration cfg= new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory= cfg.buildSessionFactory();
		Session ssn= factory.openSession();
		Transaction tx= ssn.beginTransaction();
		
		Book book = new Book();
		book.setBookid(1001);
		book.setTitle("Oracle");
		book.setAuthor("sdf");
		book.setPrice(1234);
		
		DotnetBook dotnet= new DotnetBook();
		dotnet.setBookid(2001);
		dotnet.setTitle("ASP.net");
		dotnet.setAuthor("ert");
		dotnet.setPrice(800);
		dotnet.setCds(3);
		
		JavaBook java = new JavaBook();
		java.setBookid(4001);
		java.setTitle("Spring");
		java.setAuthor("yui");
		java.setPrice(567);
		java.setDiscount(23);
		
		ssn.save(book);
		ssn.save(java);
		ssn.save(dotnet);
		tx.commit();
		ssn.close();
		


	}

}
