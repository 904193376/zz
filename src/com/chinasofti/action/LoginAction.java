package com.chinasofti.action;

public class LoginAction {
	/*
	 * action����ҳ������ݣ�ԭ����
	 * 
	 * ��������ע�룺��action�����������ԣ�������get��set������struts�Զ����á�
	 * ���Ե����ֺ�ҳ���е�name����һ��
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
