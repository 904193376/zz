package com.chinasofti.action;

import com.chinasofti.entity.User;

public class LoginEntAction {
	/*
	 *��ģ��ע��(ʵ�����ע��) 
	 *�ڴ������ݵ�ҳ���У���ǩname="����.����"
	 * 
	 * �����ֵ����Ҳ��struts2�Զ����,���ǲ���Ҫʵ����.
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
