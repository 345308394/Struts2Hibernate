package impl;

import org.junit.Test;

import junit.framework.Assert;
import sericeimpl.UsersDaoImpl;
import service.UsersDao;

import com.entity.Users;


public class TestUserDaoImpl {
	@Test
	public void testUserLogin()
	{
		Users u = new Users(1,"user1","123456");
		UsersDao udao =new UsersDaoImpl();
		Assert.assertEquals(true,udao.UsersLogin(u));
		
	}
}
