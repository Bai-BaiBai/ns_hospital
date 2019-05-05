<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/lib/bs/css/bootstrap.min.css">
<title>Insert title here</title>
<style type="text/css">
.form-signin {
	width: 330px;
	padding-top: 120px;
	margin: 0 auto;
}
</style>
</head>
<body background="${pageContext.request.contextPath }/pic/bg_login.jpg">
	<div class="container">
		<form class="form-signin" action="loginSubmit" method="post">
			<%
				String style = "label label-danger";
				String msg1 = request.getParameter("noLogin");
				String msg2 = (String) request.getAttribute("loginErrorMsg");
				String str = msg1 == null ? msg2 : "请先登录";
				if (str == null || "".equals(str)) {
					str = "请登录...";
					style = "form-signin-heading";
				}
			%>
			<h2 class="<%=style%>"><%=str%></h2>
			<label for="inputEmail" class="sr-only">账户ID</label>
			 <input
				type="text" id="inputEmail" name="account" class="form-control"
				placeholder="账户ID" required autofocus value="A01"> <label
				for="inputPassword" class="sr-only">密码</label> <input
				type="password" id="inputPassword" name="password"
				class="form-control" placeholder="密码" required value="1">
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">记住密码
				</label>
			</div>
			
			<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
			
		</form>
	</div>
	<script
		src="${pageContext.request.contextPath }/lib/bs/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/lib/bs/js/bootstrap.min.js"></script>
</body>
</html>