<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 23.04.2017
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
<%= request.getParameter("name")%>
<%=request.getParameter("family")%>
${name}
${family}
<table>
<tr>
    <th>Name</th>
    <th>Family</th>
</tr>
    <c:forEach items="${requestScope.list}" var="student">

    <tr>
        <td>
        <c:out value="${student.name}"> </c:out>
        </td>
            <td>
                <c:out value="${student.family}"></c:out>
            </td>
    </tr>
                </c:forEach>

</table>
<c:if test="${10 > 9}">
<p>True<p>
    </c:if>
    <c:if test="${10 < 9}">
<p>False<p>
    </c:if>
</body>
</html>
