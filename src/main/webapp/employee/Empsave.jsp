<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
<h1><p class="text-center">人员信息添加</p></h1>
	<button type="button" class="btn btn-primary btn-lg" action="">
  <span class="glyphicon glyphicon-arrow-left"></span> 返回
</button>
<form action="emp_save">
  <div class="form-group">
    <label>人员名称</label>
    <input type="text" class="form-control" name="name" placeholder="请输入姓名">
    <label>人员性别</label>
    <input type="text" class="form-control" name="sex" placeholder="请输入性别">
    <label>人员编号</label>
    <input type="text" class="form-control" name="number" placeholder="请输入编号">
    <label>联系方式</label>
    <input type="text" class="form-control" name="phone" placeholder="请输入联系方式">
    <label>工作职位</label>
    <input type="text" class="form-control" name="position" placeholder="请输入工作职位">
  </div>
	<p class="text-center"><button type="submit" class="btn btn-primary btn-lg">
  <span class="glyphicon glyphicon-ok"></span> 提交
		</button></p>
</form>
</body> 
</html>