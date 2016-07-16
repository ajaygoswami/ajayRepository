package stripes.demo.serviceImpl;

import org.springframework.stereotype.Component;

import stripes.demo.action.user.User;
import stripes.demo.dao.LoginDAO;
import stripes.demo.service.LoginService;
@Component
public class LoginServiceImpl implements LoginService {

	private LoginDAO loginDAO;
	@Override
	public User authenticateUser(String userId,String password) {
		
		return loginDAO.authenticateUser( userId, password);
	}
	public LoginDAO getLoginDAO() {
		return loginDAO;
	}
	
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}
	
}
