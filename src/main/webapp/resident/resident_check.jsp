<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> 
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>居民信息页面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MYCSS/table.css">
<script src="./js/jquery-3.2.1.min.js"></script>
</head>
<body class="back">
	<div class='headFont'>查看居民信息</div>
	<div class="border">
	<form>
	<table class="table" >
		<tr>
			<td class='leftFont1'>居&nbsp;民&nbsp;编&nbsp;号:</td><td>
			<input type='text' name='residentID' class="in" value="<s:property value='residentID'/>"></td>
		</tr>
		<tr>
			<td class='leftFont1'>居&nbsp;民&nbsp;姓&nbsp;名:</td><td>
			<input type='text' name='residentName' class="in" value="<s:property value='residentName'/>"></td>
		</tr>
		<tr>
			<td class='leftFont1'>居&nbsp;民&nbsp;性&nbsp;别:</td><td>
			<input type='text' name='residentSex' class="in" value="<s:property value='residentSex'/>"></td>
		</tr>
		<tr>
			<td class='leftFont1'>居&nbsp;民&nbsp;身&nbsp;份&nbsp;证&nbsp;号:</td><td>
			<input type='text' name='IdNumber' class="in" value="<s:property value='IdNumber'/>"></td>
		</tr>
		<tr>
			<td class='leftFont1'>居&nbsp;民&nbsp;手&nbsp;机&nbsp;号:</td><td>
			<input type='text' name='PhoneNumber' class="in" value="<s:property value='PhoneNumber'/>"></td>
		</tr>
		<tr>
			<td class='leftFont1'>入&nbsp;住&nbsp;日&nbsp;期:</td><td>
			<input type='text' name='CheckinTime' class="in" value="<s:property value='CheckinTime'/>"></td>
		</tr>
		<tr>
			<td align="center" colspan="2">
			<input type="submit" name='submit' value='提交' class='button'/>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" name='return' value='返回列表' class='button' onclick="window.location.href='${pageContext.request.contextPath}/resident_getAll.action'"></td>		
		</tr>
	</table>
	</form>
	</div>
</body>
</html>