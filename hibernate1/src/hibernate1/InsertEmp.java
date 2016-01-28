package hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("jack");
		emp.setMobile(4455544);
		emp.setEmail("xyz@xyz");
		s.save(emp);
		s.flush();
		tx.commit();
		s.close();
	}

}
