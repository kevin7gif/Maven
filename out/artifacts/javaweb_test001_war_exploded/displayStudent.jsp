<%@ page import="com.xiehn.Student" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023-04-13
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示</title>
</head>
<body>
<%
    Student student = (Student) request.getAttribute("student");
%>
<form>
    <table>
        <tr>
            <th>学号：</th>
            <td>
                ${requestScope.student.sid}
            </td>
        </tr>
        <tr>
            <th>姓名：</th>
            <td>
                ${requestScope.student.sname}
            </td>
        </tr>
        <tr>
            <th>性别：</th>
            <td>
                ${requestScope.student.sex}
            </td>
        </tr>
        <tr>
            <th>专业：</th>
            <td>
                ${requestScope.student.clazz}
            </td>
        </tr>
    </table>
</form>

</body>
</html>
