<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.*,com.zxy.*"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-UTF-8">
<title>员工管理</title>
<link href="css/style.css" rel="stylesheet" type="text/css"><s:head></s:head>
</head>
<body>

			<div id="header">
				<div id="topheader">
					<h1 id="title"  align="center"><a>添加楼房信息</a></h1>
				</div>
				<div id="navigation"></div>
			</div>

			<s:actionerror/>
				<s:form action="add" method="post" id="mm">
					<table  class="table table-bordered" width="70%" height="100" border="0" cellpadding="0" cellspacing="0" align="center">
                        <tr class="table_header label-success">
                            <td>业主名字</td><td>业主电话(11位数字)</td><td>楼房地址</td><td>户型</td>
                        </tr>
                        <tr>
						<td><input name="username"></td>
						<td><input name="phoneno" ></td>
						<td><input name="location"></td>
						<td><input name="apartment"></td>
                        </tr>

                            <%--<tr align="center" class="success"><td colspan="2">添加列表</td></tr>--%>
                            <%--<tr > <td class="label-success"  > <span>业主名字</span> </td> <tr>    <s:textfield name="username"/>--%>
                            <%--<tr > <td class="label-success">   <span>业主电话</span>    </td></tr>     <s:textfield name="phoneno" />--%>
                            <%--<tr >  <td class="label-success">  <span>具体位置</span>     </td>  </tr>   <s:textfield name="location" />--%>
                            <%--<tr >   <td class="label-success"> <span>户型</span>   </td> </tr>  <s:textfield name="apartment"/>--%>
				</table>
				<p  align="center">
					<input type="submit" class="button label-warning" value="确认添加" style="width: 80px"/>&nbsp;&nbsp;
					<input type="reset" class="button label-warning" value="重置">&nbsp;
				</p>
				</s:form>
            <div align="right"><button   class="button label-warning"  onclick=" location='roomlist'">返&nbsp;&nbsp;回 </button></div>

			</div>
		</div>

	</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</html>