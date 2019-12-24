<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="GB2312"%> 
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>公告信息查看页面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MYCSS/table.css">
<script src="./js/jquery-3.2.1.min.js"></script>
</head>
<body class="back">
	<div class='headFont'>查看公告信息</div>
	<div class="border">
	<form>
	<table class="table" >
		<tr>
			<td class='leftFont1'>公&nbsp;告&nbsp;标&nbsp;题:</td><td>
			<input type='text' name='announTitle' class="in" value="<s:property value='announTitle'/>"></td>
		</tr>
		<tr>
			<td class='leftFont3'>公&nbsp;告&nbsp;内&nbsp;容:</td>
			<td><textarea rows="20" cols="40" name="announContent" class="area"><s:property value='announContent'/></textarea></td>
		</tr>
		<tr>
			<td class='leftFont1'>发&nbsp;布&nbsp;人&nbsp;ID:</td><td>
			<input type='text' name='employeeID' class="in" value="<s:property value='employeeID'/>"></td>
		</tr>
		<tr>
		<tr>
			<td class='leftFont1'>公&nbsp;告&nbsp;日&nbsp;期:</td><td>
			<input type='text' name='announTime' class="in" value="<s:property value='announTime'/>"></td>
		</tr>
		<tr>
			<td align="center" colspan="2">
			<input type="button" name='return' value='返回列表' class='button' onclick="window.location.href='${pageContext.request.contextPath}/announ_getAll.action'"></td>		
		</tr>
	</table>
	</form>
	</div>
</body>
</html>