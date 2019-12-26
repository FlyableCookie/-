<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>人员信息管理</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css"> 
    <script src="<%= path%>/js/jquery-3.3.1.min.js"></script>
    <script src="<%= path%>/bootstrap4/bootstrap.min.js"></script>
    <script src="<%= path%>/bootstrap4/bootstrap.bundle.min.js"></script>
    <link type="text/css" rel="stylesheet" href="<%= path%>/bootstrap4/bootstrap.min.css">
    <script src="<%= path%>/bill/js/billJS.js"></script>
</head>
<style>
    .spanSplit{
        color: #2aabd2;
    }
</style>
<body>
<input id="ContextPath" type="hidden" value="<%=path%>">
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <ul class="navbar-nav">
        <li class="nav-item active">
            <a class="nav-link disabled" href="${pageContext.request.contextPath}/emp_getEntityList.action" style="font-size: 20px">人员信息管理</a>
        </li>
        <li>
            <a class="nav-link" href="${pageContext.request.contextPath}/emp_tianjia.action" style="font-size: 15px">添加人员信息</a>
        </li>
    </ul>
</nav>

<table class="table table-striped">
    <thead>
    <tr>
        <th>编号</th>
        <th>人员姓名</th>
        <th>性别</th>
        <th>身份证号</th>
        <th>联系方式</th>
        <th>工作职位</th>
        <th>删除操作</th>
        <th>修改操作</th>
    </tr>
    
    <s:iterator value="employeeEntityList" var="list">
    <tr>
        <td><s:property value="#list.employeeId"/></td>
        <td><s:property value="#list.employeeName"/></td>
        <td><s:property value="#list.employeeSex"/></td>
        <td><s:property value="#list.idNumber"/></td>
        <td><s:property value="#list.phoneNumber"/></td>
        <td><s:property value="#list.position"/></td>
        <td><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/emp_deleteEntity.action?integer=<s:property value="#list.employeeId"/>" style="font-size: 15px">
  <span class="glyphicon glyphicon-minus"></span> 删除
</a></td>
		<td><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/emp_gotEmployee.action?integer=<s:property value="#list.employeeId"/>" style="font-size: 15px">
  <span class="glyphicon glyphicon-pencil"></span> 修改
</a></td>
    </tr>
    </s:iterator>
</table>
</body>
</html>
