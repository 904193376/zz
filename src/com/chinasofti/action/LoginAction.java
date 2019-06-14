package com.chinasofti.action;

public class LoginAction {
	/*
	 * action接受页面的数据（原理）：
	 * 
	 * 基础属性注入：在action类中增加属性，并设置get、set方法，struts自动调用。
	 * 属性的名字和页面中的name名字一致
	 *   
	 * 
	 */
	
     private String username;
     private String password;
     
     public String execute() {
    	System.out.println("hello:"+username);
    	System.out.println("password:"+password);
    	return "succ";
     }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
     
     
}
