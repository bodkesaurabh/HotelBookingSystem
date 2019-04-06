package com.fujitsu.orm.mains;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fujitsu.bookings.Booking;



public class HibernateMain {

	public static void main(String[] args)
	{
		// create configuration
		Configuration cfg = new  Configuration();

		// read hibernate properties from hibernate.cfg.xml
		Configuration c=cfg.configure();

		// obtain session factory through configuration 

		SessionFactory factory=c.buildSessionFactory();

		// get session from session factory 
		//represent database connection
		Session session = factory.openSession();

		// get transaction through session
		Transaction tx = session.beginTransaction();

	
		Booking bk = new Booking();
		//customer.setName("pappu pagerde");
		
		
		session.save(bk);
		// commit transaction 
		tx.commit();

		//	close session: close database connection
		session.close();
	}

}
