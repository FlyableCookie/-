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
    <script src="<%= path%>/js/bootstrap.min.js"></script>
    <script src="<%= path%>/js/popper.min.js"></script>
    <link type="text/css" rel="stylesheet" href="<%= path%>/css/bootstrap.min.css">
</head>
<body>

<script>
    $(document).ready(function () {
        <%--$("#btn").click(function () {--%>
        <%--    $.ajax({--%>
        <%--        type:"GET",--%>
        <%--        url:"<%=path%>/BillAction_getBillList",--%>
        <%--        success:function (data) {--%>
        <%--            console.log(data);--%>
        <%--        }--%>
        <%--    })--%>
        <%--});--%>

        var data = JSON.parse('{"Integer":2}');
        console.log(data);
        $("#btn").click(function () {
            $.ajax({
                type:"POST",
                url:"<%=path%>/BillAction_getBill",
                datatype:"json",
                data:data,
                success:function () {

                }
            })
        });
    });
</script>

<button id="btn">this is a button</button>

</body>
</html>
