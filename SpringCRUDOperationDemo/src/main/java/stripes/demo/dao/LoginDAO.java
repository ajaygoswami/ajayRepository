package stripes.demo.dao;

import stripes.demo.action.user.User;

public interface LoginDAO {
	
	public  User authenticateUser(String userId,String password);
		
	
}
