<%--
  Created by IntelliJ IDEA.
  User: Mr.President
  Date: 2019/12/25
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>物业管理系统</title>
    <script src="<%= path%>/js/jquery-3.3.1.min.js"></script>
    <script src="<%= path%>/bootstrap4/bootstrap.min.js"></script>
    <script src="<%= path%>/bootstrap4/bootstrap.bundle.min.js"></script>
    <link type="text/css" rel="stylesheet" href="<%= path%>/bootstrap4/bootstrap.min.css">

    <style>
        html,body{
            height: 100%;
        }
        .block{
            height: 100%;
        }
        .left_block{
            position: absolute;
            left: 0;
            width: 50%;
            height: 100%;
        }
        .right_block{
            position: absolute;
            right: 0;
            width: 50%;
            height: 100%;
        }
        .photo_div{
            position: absolute;
            top: 10%;
            right: 5%;
        }
        .photo{
            border-radius: 10px;
            box-shadow: 5px 5px 10px #3c3c3c;
        }
        .btn_div{
            border-radius: 10px;
            box-shadow: 5px 5px 10px #3c3c3c;
            background-color: #002244;
            font-size: 48px;
            width: 440px;
            margin-bottom: 20px;
            transition-duration: 0.3s;
        }
        .btn_div:hover{
            background-color: #005cbf;
        }
        .btn_div:active{
            background-color: #001a34;
        }
        p{
            width: 100%;
            text-align: center;
            color: #DBB36E;
            user-select: none;
        }
    </style>
</head>
<body>
<input id="path" type="hidden" value="<%=path%>">
<div lass="block">
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link disabled" style="font-family: '华文琥珀'" href="#">小区物业管理系统</a>
            </li>
        </ul>
    </nav>

    <div class="left_block">
        <div class="photo_div">
            <img class="photo" src="image/logo.png">
        </div>
    </div>

    <div class="right_block">
        <div id="room" class="btn_div" style="margin-top: 10%">
            <p>楼房管理</p>
        </div>
        <div id="bill" class="btn_div">
            <p>账单管理</p>
        </div>
        <div id="employee" class="btn_div">
            <p>员工管理</p>
        </div>
        <div id="notice" class="btn_div">
            <p>公告管理</p>
        </div>
        <div id="resident" class="btn_div">
            <p>居民管理</p>
        </div>
    </div>

</div>

</body>

<script>
    $(document).ready(function () {
        $("#room").click(function () {
            window.location.href=$("#path").val()+'/jump2room';
        });
        $("#bill").click(function () {
            window.location.href=$("#path").val()+'/jump2bill';
        });
        $("#employee").click(function () {
            window.location.href=$("#path").val()+'/jump2employee';
        });
        $("#notice").click(function () {
            window.location.href=$("#path").val()+'/jump2notice';
        });
        $("#resident").click(function () {
            window.location.href=$("#path").val()+'/jump2resident';
        });
    })
</script>
</html>
