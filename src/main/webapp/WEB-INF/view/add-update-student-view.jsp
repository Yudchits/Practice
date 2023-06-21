<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<h1>Student details:</h1>
<br><br>

<form:form action="save-update-student" modelAttribute="student">

<%--    When we are updating details we should know about 'id'--%>
    <form:hidden path="id"/>

    <label id="name">
        Name: <form:input path="name" id="name"/>
    </label><br><br>

    <label id="surname">
        Surname: <form:input path="surname" id="surname"/>
    </label><br><br>

    <label id="avg_grade">
        Average grade: <form:input path="averageGrade" id="avg_grade"/>
    </label><br><br>

    <label id="email">
        Email: <form:input path="email" id="email"/>
    </label><br><br>

    <input type="submit" value="Ok">
</form:form>
</body>
</html>
