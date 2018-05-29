<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'signUp.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
table {
	width: 40%;
	border: 1px solid black;
	margin: 3% auto;
	padding: 2%;
}

td {
	border: 1px solid black;
}
span{
	font-size: 10px;
	color: red;
}
</style>

<script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="js/md5.js" type="text/javascript"></script>
<script type="text/javascript">
	var key = "guoyasoft";
	var valCount=0;
	$(document).ready(function() {
		$("#loginBtn").click(function(){
			checkAll();
			var password = $("#password").val();
			$("#password").val(hex_md5(password + "&key=" + key));
			if(valCount>0){
				return ;
			}else{
				$("#form").submit();
			}
		});
		
	});
	function checkUserName(){
		var reg= /^[a-zA-Z0-9]{1,8}$/;
		return validate("#userName",reg,"1到8位（英文字母，数字）");
	}
	
	function checkPassword(){
		var reg= /^[a-zA-Z]{6,8}$/;
		return validate("#password",reg,"6到8位（英文字母）");
	}
	
	
	function checkCheckCode(){
		var reg= /^[a-zA-Z0-9]{4,8}$/;
		return validate("#checkCode",reg,"4到8位（英文字母，数字）");
	}
	
	function checkAll(){
		checkUserName();
		checkPassword();
		checkCheckCode();
	}
	
	function validate(field,reg,alertText){
		//alert($(field).val());
		var value=$(field).val();
		//输出 true
		//alert(reg.test(value));
		if(!reg.test(value)){
			$(field+"Warn").html(alertText);
			valCount++;
			return false;
		}else{
			$(field+"Warn").html("");
			valCount--;
			return true;
		}
	}
	
</script>

</head>

<body>
	<center><h1>登录界面</h1></center>
	<form action="user/login.action" method="post" id="form">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="userName" id="userName" onblur="checkUserName()"></td>
				<td> <span>*</span> <span id="userNameWarn"></span></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" id="password" name="password" onblur="checkPassword()"></td>
				<td> <span>*</span> <span id="passwordWarn"></span></td>
			</tr>
			<tr>
				<td>校验码：</td>
				<td><input type="text" name="checkCode" id="checkCode" onblur="checkCheckCode()"> 12345</td>
				<td> <span>*</span> <span id="checkCodeWarn"></span></td>
			</tr>
			<tr>
				<td><input id="loginBtn" type="button" value="登录"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>
