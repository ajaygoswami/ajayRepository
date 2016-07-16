package stripes.demo.service;

import stripes.demo.action.user.User;

public interface LoginService {

	public User authenticateUser(String userId,String password);
}
