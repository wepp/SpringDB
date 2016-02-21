package com.isaiev.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
    	UserService userService = (UserService)context.getBean("userService");
    	User user = new User();
    	user.setLogin("admin");
    	user.setPassword("admin");
    	user.setRole("admin");
    	userService.createUser(user);
    	System.out.println(userService.getUserById(2));
    	
    	UserHibService userHibService = (UserHibService)context.getBean("userHibService");
    	UserEntity userH = new UserEntity();
    	userH.setLogin("adminH");
    	userH.setPassword("adminH");
    	userH.setRole("adminH");
    	userHibService.addUser(userH);
    	userH=userHibService.getUserById(3);
    	userH.setLogin("newLogin");
    	userHibService.saveUser(userH);
    }
}
