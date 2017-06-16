<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<f:form	modelAttribute="userform" method="post" action="user" commandName="userform">
	<div>
		<font color="red">
		<f:errors path="userName"/><br>
		<f:errors path="password"/><br>
		<f:errors path="age"/><br>
		</font>
	</div><br><br>
	Username : <f:input path="userName"/><br><br>	
	Password : <f:input path="password"/><br><br>	
	Age : <f:input path="age"/><br><br>	
	<input type="submit" value="Submit"/>
	</f:form>
</body>
</html>