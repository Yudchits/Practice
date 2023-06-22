<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<form:form action="change-details" modelAttribute="student">

  <h1>You can change ${student.name} details:</h1>
  <br><br>

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
    Average grade: <form:input type="number" step="0.1" path="averageGrade" id="avg_grade"/>
    <form:errors path="averageGrade"/>
  </label><br><br>

  <form:hidden path="email"/>

  <input type="submit" value="Update">

</form:form>
</body>
</html>
