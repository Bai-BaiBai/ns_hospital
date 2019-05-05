<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>出库</title>
</head>
<body>
	<form action="/store/doExportStore">
		<table>
			<tr>
				<td>批次号</td>
				<td><input type="number" name="exportId" required="required"></td>
			</tr>
			<tr>
				<td>商品单价</td>
				<td><input type="number" name="exportPrice" required="required"></td>
			</tr>
			<tr>
				<td>商品数量</td>
				<td><input type="number" name="exportNum" required="required"></td>
			</tr>
			<tr>
				<td>出货人</td>
				<td><input type="text" name="transman" required="required"></td>
			</tr>
			<tr>
				<td>商品名称</td>
				<td>
					<select name="drugId">
						<c:forEach var="d" items="${drug }">
							<option value="${d.drugNo }">${d.drugName }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="出库"></td>
			</tr>
		</table>
	</form>
	<a href="/store/returnBack">查询库存</a>
	<a href="/store/returnIndex">返回主页</a>
</body>
</html>