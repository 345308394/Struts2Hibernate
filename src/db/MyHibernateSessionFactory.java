package db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyHibernateSessionFactory 
{
	private static SessionFactory sessionFactory;
	//构造方法私有化，保证单例模式
	private MyHibernateSessionFactory()
	{
		
		
	}
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			Configuration config = new Configuration().configure();
			sessionFactory  = config.buildSessionFactory();	
			return sessionFactory;
		}
		else
		{
			return sessionFactory;
		}
	}
}

