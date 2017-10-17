package entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

import com.entity.Students;
import com.entity.Users;

public class TestStudent {
	@Test
	public void testSchemaExport() 
	{
		
		Students student = new Students();
		student.setSName("wangzhaoxin1");
		student.setSSex("1");
		
		Users user = new Users();
		user.setUserName("wangzhaoxin2");
		user.setUserpassword("987654321");
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(student);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
