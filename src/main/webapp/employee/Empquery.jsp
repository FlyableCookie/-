<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h1><p class="text-center">人员信息列表</p></h1>
   <table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<td>姓名</td>
			<td>性别</td>
			<td>编号</td>
			<td>联系方式</td>
			<td>工作职位</td>
			<td><a href="emp-">添加人员信息</a></td>
		</tr>
		<tr>
		    <td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><a href="emp-?id=${id}"></a>删除</td>
		</tr>
   </table>
</body>
</html>