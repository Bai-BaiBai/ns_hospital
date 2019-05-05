<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<link rel="stylesheet"
	href="${pageContext.request.contextPath }/lib/bs/css/bootstrap.min.css">

<style type="text/css">
.fontStyle {
	color: #b6710f; /*e38d13*/
	font-family: "微软雅黑";
	font-weight: bold;
	font-size: 16px;
}

body {
	background: url('${pageContext.request.contextPath }/pic/bg_main.jpg');
}
</style>
<div class="collapse navbar-collapse bs-example-js-navbar-collapse">
	<ul class="nav nav-pills navbar-nav">
<!-- -------------------------------------------------- 首页 -------------------------------------------------- -->
		<li role="presentation" class="active"><a class="fontStyle"
			href="${pageContext.request.contextPath }/index">首页</a></li>
<!-- -------------------------------------------------- 门诊挂号 -------------------------------------------------- -->
		<li role="presentation"><a href="#" class="fontStyle">门诊挂号</a></li>
<!-- -------------------------------------------------- 门诊收费 -------------------------------------------------- -->
		<li id="fat-menu" class="dropdown"><a id="drop3" href="#"
			class="dropdown-toggle fontStyle" data-toggle="dropdown"
			role="button" aria-haspopup="true" aria-expanded="false">门诊收费 <span
				class="caret"></span>
		</a>
			<ul class="dropdown-menu" aria-labelledby="drop3">
				<li><a
					href="${pageContext.request.contextPath }/backmoney/back.action">门诊退费</a></li>
			</ul></li>
<!-- ---------------------------------------- 门诊收费......住院收费结算 ---------------------------------------- -->
		<li role="presentation"><a href="#" class="fontStyle">门诊药房</a></li>
		<li role="presentation"><a href="#" class="fontStyle">住院收费结算</a></li>
		<li role="presentation"><a href="#" class="fontStyle">住院收费结算</a></li>
		<li role="presentation"><a href="#" class="fontStyle">住院收费结算</a></li>
<!-- ------------------------------------------------ 住院药房管理 ------------------------------------------------ -->
		<li id="fat-menu" class="dropdown"><a id="drop3" href="#"
			class="dropdown-toggle fontStyle" data-toggle="dropdown"
			role="button" aria-haspopup="true" aria-expanded="false"> 住院药房管理
				<span class="caret"></span>
		</a>
			<ul class="dropdown-menu" aria-labelledby="drop3">
				<li><a
					href="${pageContext.request.contextPath }/store/selectAll">库存管理</a></li>
				<li><a href="${pageContext.request.contextPath }/store/importStore">入库管理</a></li>
				<li><a href="${pageContext.request.contextPath }/store/exportStore">退库管理</a>
				</li>
				<li><a
					href="${pageContext.request.contextPath }/patient.action">医嘱核对长期医嘱分解</a>
				</li>
			</ul></li>
<!-- ----------------------------------------------- 住院入转出管理 ----------------------------------------------- -->
		<li id="fat-menu" class="dropdown"><a id="drop3" href="#"
			class="dropdown-toggle fontStyle" data-toggle="dropdown"
			role="button" aria-haspopup="true" aria-expanded="false"> 住院入转出管理
				<span class="caret"></span>
		</a>
			<ul class="dropdown-menu" aria-labelledby="drop3">
				<li><a
					href="${pageContext.request.contextPath }/yardlist.action">本院目前住院情况</a></li>
				<li><a href="${pageContext.request.contextPath }/yardin.action">办理入院</a></li>
				<li><a href="#">办理出院</a></li>
				<li><a href="#">办理转院</a></li>
			</ul></li>
<!-- ------------------------------------------------ 系统用户管理 ------------------------------------------------ -->
		<li id="fat-menu" class="dropdown"><a id="drop3" href="#"
			class="dropdown-toggle fontStyle" data-toggle="dropdown"
			role="button" aria-haspopup="true" aria-expanded="false"> 系统用户管理
				<span class="caret"></span>
		</a>
			<ul class="dropdown-menu" aria-labelledby="drop3">
				<li><a
					href="${pageContext.request.contextPath }/getUserList">系统用户列表</a></li>
				<li><a
					href="${pageContext.request.contextPath }/userAdd">增加新用户</a></li>
			</ul></li>
	</ul>
<!-- -------------------------------------------------- 退出系统 -------------------------------------------------- -->
	<ul class="nav nav-pills navbar-right">
		<li role="presentation" style="text-align: right"><a
			href="${pageContext.request.contextPath }/logout" class="fontStyle">退出系统</a></li>
	</ul>
</div>
