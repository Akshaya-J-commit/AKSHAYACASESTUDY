<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/admin/process" modelAttribute="admin">
VendorId:<form:input path="vendorId"/><br>
FirstName:<form:input path="firstName"/><br>
LastName:<form:input path="lastName"/><br>
Age:<form:input path="age"/><br>
Gender:<form:input path="gender"></form:input><br>
ContactNumber:<form:input path="contactNumber"/><br>
PassWord:<form:input path="passWord"/>
<input type="submit" value="Submit">
</form:form>
</body>
</html>