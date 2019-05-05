<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function del(storeId) {
		if(confirm("确认删除该记录么？库存条目：" + storeId)){
			return true;
		}else{
			return false;
		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>全部库存</title>
</head>
<body>
	${SUCCESS }
	${ERROR }
	<form action="/store/selectByName">
		<input type="text" name="drug_name" placeholder="按药品名称查询">
		<input type="submit" value="提交">
	</form>
	<table border="1">
		<tr>
			<th>批次号</th>
			<th>库存条目</th>
			<th>药品名</th>
			<th>入库日期</th>
			<th>在库量</th>
			<th>经销商名称</th>
			<th>单位</th>
			<th>仓库名</th>
		</tr>
		<c:forEach var="s" items="${store }">
			<tr>
				<td>${s.import_id }</td>
				<td>${s.store_id }</td>
				<td>${s.drug_name }</td>
				<td>${s.import_date }</td>
				<td>${s.remain_num }</td>
				<td>${s.supply}</td>
				<td>${s.unit }</td>
				<td>${s.location }</td>
				<td><a href="/store/doDeleteStore?storeId=${s.store_id }" onclick="return del(${s.store_id })">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="/store/returnIndex">返回主页</a>
</body>
</html>