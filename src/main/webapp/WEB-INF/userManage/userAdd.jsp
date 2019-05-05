<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加用户</title>
</head>
<body>
	${ERROR }
	<form action="doUserAdd">
		<table>
			<tr>
				<td>账户</td>
				<td><input type="text" name="account"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password"></td>
			</tr>
			<%-- <tr>
				<td>姓名</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>部门</td>
				<td>
					<select name="deptId">
						<c:forEach var="d" items="${dept}">
							<option value="${d.deptId }">${d.deptName }</option>
						</c:forEach>
					</select>
				</td>
			</tr> --%>
			<tr>
				<td colspan="2"><input type="checkbox" name="enable" checked="checked" value="1">是否启用</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>