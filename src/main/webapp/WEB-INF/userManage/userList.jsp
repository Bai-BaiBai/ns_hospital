<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>系统用户列表</title>
</head>
<body>
	<form action="selectByName">
		<input name="username" type="text" placeholder="按用户名查询" />
		<input type="submit" value="查找"/>
		
	</form>
	<a href="userAdd"><button>添加用户</button></a>
	<table border="1">
		<tr>
			<th>id</th>
			<th>账户</th>
			<!-- <th>姓名</th>
			<th>职位</th>
			<th>部门</th> -->
		</tr>
		<c:forEach var="user" items="${userList }">
			<tr>
				<td>${user.id }</td>
				<td>${user.account }</td>
				<%-- <td>${user.name }</td>
				<td>${user.job }</td>
				<td>${user.deptName }</td> --%>
				<td>
					<a href="userModify?id=${user.id }">修改</a>
					<a href="userDelete?id=${user.id }">删除</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>