<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="GB18030">
<script src="js/jquery-3.2.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>��½�ɹ���ע��ɹ�</h1>
	<form name="ifsuccess" action="${pageContext.request.contextPath}/try.action" method="post">
	<h1>${sessionScope.userName}</h1>
	<input type="submit" name="button" value="�������������"/>
	</form>
</body>
</html>