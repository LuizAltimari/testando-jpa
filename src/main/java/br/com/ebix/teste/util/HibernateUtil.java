package br.com.ebix.teste.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {

	private static SessionFactory sessionFactory = createSessionFactory();
	
	private static SessionFactory createSessionFactory() {
		try {
			Configuration config = new Configuration().configure();
			ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			SessionFactory sf = config.buildSessionFactory(registro);
			return sf;
		}catch(Throwable e) {
			System.err.println("Initial Session Factory creation failed " + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static void closeConnectionFactory() {
		
		sessionFactory.close();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
