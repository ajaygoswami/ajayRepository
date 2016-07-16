package stripes.demo.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import stripes.demo.Constants.Constants;
import stripes.demo.action.user.User;

import stripes.demo.controllers.ASGStripesBean;
@UrlBinding("/Home.action")
public class HomeActionBean extends ASGStripesBean {
	private User user;

	@DefaultHandler
	public Resolution dislay() {
		Resolution resolution;
		setUser(getContext().getUser());
		resolution = new ForwardResolution(Constants.HOMEPAGE);
		return resolution;

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
