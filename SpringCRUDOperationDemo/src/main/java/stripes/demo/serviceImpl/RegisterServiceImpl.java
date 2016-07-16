package stripes.demo.serviceImpl;

import stripes.demo.action.user.User;
import stripes.demo.dao.LoginDAO;
import stripes.demo.dao.RegisterDAO;
import stripes.demo.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {

	private RegisterDAO registerDAO;

	@Override
	public String registerUser(User user) {
		if (!registerDAO.isUserExist(user.getUsername())) {
			return registerDAO.registerUser(user);
		}
		String msg="User already exists";
		return msg;
	}

	public RegisterDAO getRegisterDAO() {
		return registerDAO;
	}

	public void setRegisterDAO(RegisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	}

}
