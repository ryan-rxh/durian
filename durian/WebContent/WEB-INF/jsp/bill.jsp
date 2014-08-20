<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bill</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>User</td>
				<td>Summary</td>
				<td>Cost</td>
				<td>CreateDate</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="bill" items="${page.data}">
				<tr>
					<td>${bill.id}</td>
					<td>${bill.user.userId }</td>
					<td>${bill.summary }</td>
					<td>${bill.cost }</td>
					<td><fmt:formatDate value="${bill.createTime }" type="both" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>