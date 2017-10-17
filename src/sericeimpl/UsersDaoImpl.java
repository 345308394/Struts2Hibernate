package sericeimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import service.UsersDao;

import com.entity.Users;

import db.MyHibernateSessionFactory;

public class UsersDaoImpl implements UsersDao{

	@Override
	public boolean UsersLogin(Users u) {
		// TODO Auto-generated method stub
		//事物对象
		Transaction tx = null;
		String hql = "";
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx =session.beginTransaction();
			hql=" from Users where UserName=? and Userpassword=?";
			Query query=session.createQuery(hql);			
			query.setParameter(0, u.getUserName());
			query.setParameter(1, u.getUserpassword());
			List list= query.list();
			tx.commit();
			if(list.size()>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
		finally
		{
			if(tx!=null)
			{
				
				tx=null;
			}
		}
	}
	
}	
