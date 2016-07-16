package stripes.demo.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import stripes.demo.action.user.User;
import stripes.demo.serviceImpl.LoginServiceImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ajay/applicationContext.xml");
		
		LoginServiceImpl as=(LoginServiceImpl) context.getBean("loginService");
		User user=new User();
		user.setMsg("ajay coming");
		System.out.println(as.authenticateUser("ajay","ajay").getMsg());


	}

}
