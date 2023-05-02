<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023-04-13
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息录入</title>
</head>
<body>
    <form action="display" method="post">
        <table>
            <tr>
                <th>学号</th>
                <td>
                    <input type="text" name="sid">
                </td>
            </tr>
            <tr>
                <th>姓名</th>
                <td>
                    <input type="text" name="sname">
                </td>
            </tr>
            <tr>
                <th>性别</th>
                <td>
                    <input type="text" name="sex">
                </td>
            </tr>
            <tr>
                <th>专业</th>
                <td>
                    <input type="text" name="clazz">
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="录入">
                    <input type="reset" value="重置">
                </td>
            </tr>
        </table>

    </form>

</body>
</html>
