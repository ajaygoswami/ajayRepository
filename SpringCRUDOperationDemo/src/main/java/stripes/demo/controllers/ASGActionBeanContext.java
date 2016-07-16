package stripes.demo.controllers;

import net.sourceforge.stripes.action.ActionBeanContext;
import stripes.demo.action.user.User;

public class ASGActionBeanContext extends ActionBeanContext {
	public void setUser(User user){
		getRequest().getSession().setAttribute("user",user);
	}
	public User getUser(){
		return (User) getRequest().getSession().getAttribute("user");
	}
}
