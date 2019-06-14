package com.chinasofti.action;

public class HelloAction {
	/*
	 * 方法声明必须是public String
	 * 而且参数必须为空
	 */
     public String execute() {
    	 //todo：实现M(model)的功能
    	 
    	 
    	 //返回值是特定的字符串，该字符串和struts.xml文件中的对应action的result的name一致
    	 return "success";
     }
}
