package mvchbn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
     public void addCustomer(Customer cust){
    	 Session session= sessionFactory.openSession();
    	 Transaction tx= session.beginTransaction();
    	 session.save(cust);
    	 tx.commit();
    	 session.close();
     }
}
