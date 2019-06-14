package com.chinasofti.action;

import com.chinasofti.entity.User;

public class LoginEntAction {
	/*
	 *域模型注入(实体对象注入) 
	 *在传入数据的页面中，标签name="对象.属性"
	 * 
	 * 这个传值过程也是struts2自动完成,我们不需要实例化.
	 */
	
     private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
     
     public String execute() {
    	 System.out.println(user.getUsername());
    	 System.out.println(user.getPassword());
    	 
    	 return "ok";
     }
}
