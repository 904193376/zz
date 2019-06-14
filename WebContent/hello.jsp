<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
  Hello struts!
  <!-- 1.使用EL表达式 -->
  <%-- <h3>hello:${username}</h3><br>
  <h3>password:${password}</h3> --%>
  <h3>hello:${user.username}</h3><br>
  <h3>password:${user.password}</h3>
  
  <!-- 2.S标签 -->
  <h3><s:property value="user.username"/></h3>
</body> 
</html>