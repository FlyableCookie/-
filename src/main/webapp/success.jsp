<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="GB18030">
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>登陆成功、注册成功</h1>
	<form name="ifsuccess" action="announ_getAll" method="post">
	<h1>${userName}</h1>
	<input type="submit" name="button" value="点击测试表单"/>
	</form>
</body>
</html>