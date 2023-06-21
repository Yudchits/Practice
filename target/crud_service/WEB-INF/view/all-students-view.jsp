<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All students</title>
</head>
<body>

<h1>All students</h1><br><br>

<table border="1">

    <thead>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Average grade</th>
            <th>Email</th>
            <th>Operations</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach var="student" items="${students}">

<%--            Just a reference that will not display--%>
            <c:url var="update_button" value="/update-details">
                <c:param name="id" value="${student.id}"/>
            </c:url>

            <tr>
                <td>${student.name}</td>
                <td>${student.surname}</td>
                <td>${student.averageGrade}</td>
                <td>${student.email}</td>
                <td>
                    <input type="button" value="Update"
                    onclick="window.location.href='${update_button}'">
                </td>
            </tr>

        </c:forEach>
    </tbody>
</table>

<br><br>

<input type="button" value="Add" onclick="window.location.href='add-student'">

</body>
</html>
