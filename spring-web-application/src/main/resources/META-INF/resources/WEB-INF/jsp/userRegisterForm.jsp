<?@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1">
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>User Registration Form</title>
</head>
<body>
    <div style="text-align: center;"><h1>User Registration Form</h1></div>
    <c:if test="${not empty message}">
            <div style="color: green; text-align: center;"><b><c:out value="${message}"/></b></div>
    </c:if>

    <c:if test="${not empty errorMessage}">
            <div style="color: red; text-align: center;"><b><c:out value="${errorMessage}"/></b></div>

    </c:if>
    <form name="userForm"  action="saveUser" method="POST">
        <table style="margin-left: auto; margin-right: auto">
        <tr>
        <td>First Name: </td>
        <td><input type="text" name="first_name" placeholder="Please enter First Name" style="width: 300px" required></td>
        </tr>
        <tr>
        <td>Last Name: </td>
        <td><input type="text" name="last_name" placeholder="Please enter Last Name" style="width: 300px" required></td>
        </tr>
        <tr>
        <td>Email: </td>
        <td><input type="text" name="email" placeholder="Please enter Email" style="width: 300px" required></td>
        </tr>
        <tr>
        <td>Password: </td>
        <td><input type="password" name="password" placeholder="Please enter Password" style="width: 300px" required></td>
        </tr>
        <tr>

</table>
<div style="text-align: center;"><button type="submit" name="submitbtn">Submit</button></div>
</form>
</body>
</html>