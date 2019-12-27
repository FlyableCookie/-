<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<h1><p class="text-center">人员信息修改</p></h1>
	<a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/emp_getEntityList.action">
  <span class="glyphicon glyphicon-arrow-left"></span> 返回
</a>

<form action="${pageContext.request.contextPath}/emp_updateEntity.action" method="post">
<s:iterator value="employeeEntityList" var="list">
  <div class="form-group">
  <label>人员编号</label>
    <input type="text" class="form-control" name="employeeEntity.employeeId" placeholder="请输入编号" value="<s:property value="#list.employeeId"/>">
    <label>人员名称</label>
    <input type="text" class="form-control" name="employeeEntity.employeeName" placeholder="请输入姓名" value="<s:property value="#list.employeeName"/>">
    <label>人员性别</label>
    <input type="text" class="form-control" name="employeeEntity.employeeSex" placeholder="请输入性别" value="<s:property value="#list.employeeSex"/>">
    <label>身份证号</label>
    <input type="text" class="form-control" name="employeeEntity.idNumber" placeholder="请输入身份证号" value="<s:property value="#list.idNumber"/>">
    <label>联系方式</label>
    <input type="text" class="form-control" name="employeeEntity.phoneNumber" placeholder="请输入联系方式" value="<s:property value="#list.phoneNumber"/>">
    <label>工作职位</label>
    <input type="text" class="form-control" name="employeeEntity.position" placeholder="请输入工作职位" value="<s:property value="#list.position"/>">
  </div>
	<p class="text-center"><button type="submit" class="btn btn-primary btn-lg">
  <span class="glyphicon glyphicon-ok"></span> 提交
		</button></p>
</s:iterator>
</form>
</body> 
</html>