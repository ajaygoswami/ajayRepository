package stripes.demo.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.integration.spring.SpringBean;
import stripes.demo.Constants.Constants;
import stripes.demo.action.user.User;
import stripes.demo.controllers.ASGStripesBean;
import stripes.demo.dao.RegisterDAO;
import stripes.demo.service.RegisterService;

@UrlBinding("/Register.action")
public class RegisterActionBean extends ASGStripesBean {

	private User user;
	private RegisterService registerService;

	@DefaultHandler
	public Resolution display() {
		Resolution resolution;
		resolution = new ForwardResolution(Constants.REGISTERPAGE);
		return resolution;
	}

	public Resolution register() {
		Resolution resolution = new ForwardResolution(Constants.REGISTERPAGE);
		System.out.println(registerService.registerUser(user));
		resolution = new ForwardResolution(Constants.LOGINPAGEURL);
		return resolution;
	}

	

	public RegisterService getRegisterService() {
		return registerService;
	}
@SpringBean("registerService")
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
