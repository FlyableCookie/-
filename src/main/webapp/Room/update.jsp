<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.*,com.zxy.entity.*"%>
<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-UTF-8">
<title>员工管理</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrap">
		<div id="top_content">
			<div id="header">

				<div id="topheader">
					<h1 id="title" align="center"><a href="#">修改楼房信息</a></h1>
				</div>
				<div id="navigation"></div>
			</div>
			<div id="content">
                <form action="upt" method="post">
					<table  class="table table-bordered" width="100%" height="100" border="0" cellpadding="0" cellspacing="0" align="center">
						<tr class="table_header label-success">
						<td>业主姓名</td><td>业主电话(11位数字)</td><td>具体地址(不允许修改)</td><td>户型(不允许修改)</td>
						</tr>
					<tr class="row1">
                        <%
                            List room = (List)session.getAttribute("userlist1");

                                Room  e=(Room)room.get(0);

                        %>
						<td><input name="username"  value="<%=e.getUsername()%>"></td>
						<td><input name="phoneno"  value="<%=e.getPhoneno()%>"></td>
						<td><input name="location" readonly="true"value="<%=e.getLocation()%>"></td>
						<td><input name="apartment" readonly="true" value="<%=e.getApartment()%>"></td>
					</tr>
				</table>
					<p  align="center">
						<input type="submit" class="button label-warning" value="确认修改" style="width: 80px"/>&nbsp;&nbsp;

						<button class="button label-warning" onclick="javascript:history.back(-1);">返&nbsp;&nbsp;回 </button>
					</p>
				</form>
			</div>
		</div>

	</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</html>