<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<h1>Student info:</h1>
<br><br>

<form:form action="save-update-student" modelAttribute="student">

    <label id="name">Name: </label>
    <form:input path="name" id="name"/><br><br>

    <label id="surname">Surname: </label>
    <form:input path="surname" id="surname"/><br><br>

    <label id="avg_grade">Average grade: </label>
    <form:input path="averageGrade" id="avg_grade"/><br><br>

    <label id="email">Email</label>
    <form:input path="email" id="email"/><br><br>

    <input type="submit" value="Ок">
</form:form>
</body>
</html>
