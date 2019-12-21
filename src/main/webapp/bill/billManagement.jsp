<%--
  Created by IntelliJ IDEA.
  User: Mr.President
  Date: 2019/12/10
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>账单管理</title>
    <script src="<%= path%>/js/jquery-3.3.1.min.js"></script>
    <script src="<%= path%>/js/bootstrap.js"></script>
    <script src="<%= path%>/js/popper.min.js"></script>
    <link type="text/css" rel="stylesheet" href="<%= path%>/css/bootstrap.min.css">
</head>
<body>

<script>
    $(document).ready(function () {
    <%--    var data = JSON.parse('{"Integer":2}');--%>
    <%--    console.log(data);--%>
    <%--    $("#btn").click(function () {--%>
    <%--        $.ajax({--%>
    <%--            type:"POST",--%>
    <%--            url:"<%=path%>/BillAction_getBill",--%>
    <%--            datatype:"json",--%>
    <%--            data:data,--%>
    <%--            success:function () {--%>

    <%--            }--%>
    <%--        })--%>
    <%--    });--%>
    <%--});--%>
</script>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <ul class="navbar-nav">
        <li class="nav-item active">
            <a class="nav-link disabled" href="#">账单管理</a>
        </li>
        <li class="nav-item">
            <a class="nav-link disabled" href="#">nothing is true, everything is permitted</a>
        </li>
    </ul>
</nav>

<table class="table table-striped">
    <thead>
    <tr>
        <th>名称</th>
        <th>城市</th>
        <th>邮编</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Tanmay</td>
        <td>Bangalore</td>
        <td>560001</td>
    </tr>
    <tr>
        <td>Sachin</td>
        <td>Mumbai</td>
        <td>400003</td>
    </tr>
    <tr>
        <td>Uma</td>
        <td>Pune</td>
        <td>411027</td>
    </tr>
    </tbody>
</table>



</body>
</html>
