package hbn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployeeApp {

	public static void main(String[] args) {
		AnnotationConfiguration cfg= new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory= cfg.buildSessionFactory();
		Session ssn= factory.openSession();
		Transaction tx= ssn.beginTransaction();
		Employee emp= new Employee();
		emp.setEmpcode(108);
		emp.setEmpname("kamal");
		emp.setSalary(97000);
		ssn.save(emp);
		tx.commit();
		ssn.close();
		

	}

}
