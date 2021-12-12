<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="springmvcProcessForm" modelAttribute="student">
First name: <form:input path="firstName"/><br>
Last name: <form:input path="lastName"/><br>
Gender: <form:radiobuttons path="gender" items="${gender}"/><br>
Hobby:<br>
<form:checkbox path="hobby" value="Cricket"/>Cricket
<form:checkbox path="hobby" value="Chess"/>Chess
<form:checkbox path="hobby" value="Volleyball"/>Volleyball <br>

<input type="submit" value="Submit"/>
</form:form>

</body>
</html>