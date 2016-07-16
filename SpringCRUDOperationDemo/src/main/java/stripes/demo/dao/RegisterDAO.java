package stripes.demo.dao;

import stripes.demo.action.user.User;

public interface RegisterDAO {
	/*
	 * Signing up a new user
	 */
	public String registerUser(User user);
	/*
	 * To check whether user already Exists
	 */
	public Boolean isUserExist(String username);
	
}
