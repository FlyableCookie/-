<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.*,com.zxy.entity.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-UTF-8">
    <title>楼房信息管理</title>
</head>
<body>
<div class="container-fluid">
    <div id="topheader" >
        <h1 id="title" align="center"><a >楼房管理</a></h1>
    </div>
    <div id="navigation"></div>
</div>
<div id="content">
    <table  class="table table-bordered" width="100%" height="100" border="0" cellpadding="0" cellspacing="0" align="center">
        <tr>
            <td  class="tb_showall label-info" height="25" colspan="12" align="center"  ><font color="white">楼房列表</font></td>
        </tr>
        <tr class="table_header">
            <td>业主名字</td><td>业主电话</td><td>楼房地址</td><td>户型</td><td>操作</td>
        </tr>
        <%
            List room = (List)session.getAttribute("userlist");
            System.out.println(room.size());
            for(int i=0;i<room.size();i++){
                Room e =( Room)room.get(i);
        %>
        <tr class="td_<%=i%2+1 %>">
            <td><%=e.getUsername() %></td>
            <td><%=e.getPhoneno() %></td>
            <td><%=e.getLocation() %></td>
            <td><%=e.getApartment() %></td>

            <td>
                <a href="del?username=<%=e.getUsername()%>">删除</a>&nbsp;&nbsp;
                <a href="uptPage?username=<%=e.getUsername()%>">修改</a>
            </td>
        </tr>
        <%
            }
        %>
    </table>
    <p>
         &nbsp;&nbsp;&nbsp;<input type="button" class="btn btn-default label-warning" aria-label="Left Align"class="button" value="添加楼房信息"
               onclick="location='addPage'"/>
    </p>
</div>
</div>
</div>


</body>

<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</html>