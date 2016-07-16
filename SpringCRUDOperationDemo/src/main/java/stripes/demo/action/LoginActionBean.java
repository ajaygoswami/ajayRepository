package stripes.demo.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.integration.spring.SpringBean;
import stripes.demo.Constants.Constants;
import stripes.demo.Utils.CommonUtils;
import stripes.demo.action.user.User;
import stripes.demo.controllers.ASGStripesBean;
import stripes.demo.service.LoginService;

@UrlBinding("/Login.action")
public class LoginActionBean extends ASGStripesBean {

	public static Logger logger=LoggerFactory.getLogger(LoginActionBean.class);
	private User user;

	private LoginService loginService;

	@DefaultHandler
	public Resolution direct() {
		Resolution resolution =null;
		if(logger.isDebugEnabled()){
			logger.info("Application Running in Debug mode");
		}
		try{
		resolution = new ForwardResolution(Constants.LOGINPAGEURL);
		}
		catch(Exception e){
			logger.error("Direct method",e.getMessage());
		}
		return resolution;
	}

	public Resolution login() {
		Resolution resolution = new ForwardResolution(Constants.LOGINPAGEURL);

	    user = loginService.authenticateUser(user.getUsername(), user.getPassword());
		getContext().setUser(user);
		if (!CommonUtils.isNull(user)) {
			resolution=new RedirectResolution(HomeActionBean.class);
		}
		return resolution;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	@SpringBean("loginService")
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}
