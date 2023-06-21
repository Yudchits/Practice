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
        <form:errors path="name"/>
    </label><br><br>

    <label id="surname">
        Surname: <form:input path="surname" id="surname"/>
        <form:errors path="surname"/>
    </label><br><br>

    <label id="avg_grade">
        Average grade: <form:input type="number" step="0.1" min="0" max="10" path="averageGrade" id="avg_grade"/>
        <form:errors path="averageGrade"/>
    </label><br><br>

    <label id="email">
        Email: <form:input path="email" id="email"/>
        <form:errors path="email"/>
    </label><br><br>

    <input type="submit" value="Ok">
</form:form>
</body>
</html>
