package org.silk;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHelper {
	private static final SessionFactory sessionFactory;
	static{
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}catch(Throwable e){
			System.err.println("Error in creating SessionFactory object."
                    + e.getMessage());
            throw new ExceptionInInitializerError(e);
		}
	}
	/**
     * A static method for other application to get SessionFactory object
     * initialized in this helper class.
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
