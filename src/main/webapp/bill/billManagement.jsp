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
    <script src="<%= path%>/bootstrap4/bootstrap.min.js"></script>
    <script src="<%= path%>/bootstrap4/bootstrap.bundle.min.js"></script>
    <link type="text/css" rel="stylesheet" href="<%= path%>/bootstrap4/bootstrap.min.css">
    <script src="<%= path%>/bill/js/billJS.js"></script>
</head>
<style>
    .spanSplit{
        color: #2aabd2;
    }
    .img-div{
        position: absolute;
        right: 0;
        bottom: 0;
    }
</style>
<body>
<input id="ContextPath" type="hidden" value="<%=path%>">
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <ul class="navbar-nav">
        <li class="nav-item active">
            <a class="nav-link disabled" href="<%=path%>/main.jsp">账单管理</a>
        </li>
        <li>
            <a class="nav-link" href="#" data-toggle="modal"
               data-target="#addModal">添加账单</a>
        </li>
        <li>
            <a id="all" class="nav-link" href="#">全部账单</a>
        </li>
        <li>
            <a id="byStatus" class="nav-link" href="#">未缴费账单</a>
        </li>
        <li style="position: absolute;right: 10px">
            <a class="nav-link disabled" style="display: inline" href="#">Merry Christmas</a>
            <img src="image/timg.gif" style="width: 50px; height: 50px;display: inline">
        </li>
<%--        <li class="nav-item">--%>
<%--            <a class="nav-link disabled" href="#">nothing is true, everything is permitted</a>--%>
<%--        </li>--%>
    </ul>
</nav>

<table class="table table-striped">
    <thead>
    <tr>
        <th>时间</th>
        <th>姓名</th>
        <th>类型</th>
        <th>金额</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody id="tbody">
    </tbody>

    <div class="container">
        <!-- 模态框 -->
        <div class="modal fade" id="addModal">
            <div class="modal-dialog">
                <div class="modal-content">

                    <!-- 模态框头部 -->
                    <div class="modal-header">
                        <h4 class="modal-title">添加账单</h4>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>

                    <!-- 模态框主体 -->
                    <div class="modal-body">
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">居民编号</span>
                            </div>
                            <input id="save_residentId" type="text" class="form-control"
                                   placeholder="00000">
                        </div>

                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">账单类型</span>
                            </div>
                            <select id="save_billType" class="form-control">
                                <option>电费</option>
                                <option>水费</option>
                                <option>维修费</option>
                            </select>
                        </div>

                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">金额</span>
                            </div>
                            <input id="save_billMoney" type="text" class="form-control"
                                   placeholder="￥0.00">
                        </div>


                    </div>

                    <!-- 模态框底部 -->
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" id="save"
                                data-dismiss="modal">完成</button>
                    </div>

                </div>
            </div>
        </div>

    </div>

<%--    <div class="img-div">--%>
<%--        <img src="image/bill.jpg" style="width: 206px; height: 154px"/>--%>
<%--    </div>--%>

</table>



</body>
</html>
