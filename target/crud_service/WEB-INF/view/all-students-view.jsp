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
        </tr>
    </thead>

    <tbody>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.name}</td>
                <td>${student.surname}</td>
                <td>${student.averageGrade}</td>
                <td>${student.email}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
