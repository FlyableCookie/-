<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="GB2312"%> 
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>公告列表页面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MYCSS/list.css">
<script src="./js/jquery-3.2.1.min.js"></script> 
<script type="text/javascript">
window.onload = function(){
	var msg = "${requestScope.error}";
	if(msg != null && !msg.equals("")){
		alert(msg);
	}
}
</script>
</head>
<body class="back">
	<div class="find">
		<div>
		<form method="post" name="form" action="${pageContext.request.contextPath}/announ_findLike.action">
		<table class="table1" cellpadding="0" cellspacing="0" align="center">
			<tr>
				<td align="center">
					<input type="text" name="announTitle" class="in"/>
					<input type="submit" class="button1" value="搜 索"/>
					<input type="button" name="Refresh" value="刷新列表" class="button1" onclick="window.location.href='${pageContext.request.contextPath}/announ_getAll.action'"/></td>
			</tr>
		</table>
		</form>
		</div>	
	</div>
	<table cellpadding="4" cellspacing="2" class="table2">
		<tr>
			<td height="25" colspan="8" class="tb_showall" align="center">&nbsp;公告信息列表
				<span style="color:red"><s:actionerror/></span>
				<input type="submit" name="Delete" value="删 除" id="delAll" class="button3" />
				<input type="button" name="SelectAll" onclick="selectAll()" value="全 选"  id="select" class="button3"/>
				<input type="submit" name="Submit" value="+ 新 增" class="button2" onclick="window.location.href='${pageContext.request.contextPath}/announ/announ_add.jsp'"/></td>
		</tr>
		<tr class="td_header">
			<td></td>
			<td>公告编号</td>
	        <td>公告标题</td>
	        <td>公告内容</td>
	        <td>发布时间</td>
	        <td>发布人ID</td>
	        <td></td>
		</tr>
		<tbody class="tbody">
		<s:iterator value="announ" var="announ">
        <tr class="td_2">
        	<td><input type="checkbox" name="check" id="check"></td>
            <td><s:property value="#announ.announId"/></td>
            <td><s:property value="#announ.announTitle"/></td>
            <td><s:property value="#announ.announContent"/></td>
            <td><s:property value="#announ.announTime"/></td>
            <td><s:property value="#announ.employeeID"/></td>
            <td><input type="button" class="button6" value="查  看" onclick="window.location.href='${pageContext.request.contextPath}/announ_Check.action?announId=<s:property value='#announ.announId'/>'">&nbsp;&nbsp;
				<input type="button" class="button5" name="del" value="删  除" onclick="window.location.href='${pageContext.request.contextPath}/announ_Delete.action?announId=<s:property value='#announ.announId'/>'">
			</td>
        </tr>
    </s:iterator>
		</tbody>
		</table>
		<div class="bottom"></div>
  </body>
<%--   
		<script>
			/* 实现全选的js代码 */
				function selectAll(){	
					var select = document.getElementById('select');
					var check = document.getElementsByName("check");
					//将未勾选的选项锁定值变为true，实现全勾选
					if(select.value == "全 选"){
						for(var i = 0; i < check.length; i++) { 
							if(check[i].checked == false){
								check[i].checked = true;
							}
						}
						select.value = "取消全选";
					}
					//将勾选的选项锁定值变为false，实现取消全勾选
					else if(select.value == "取消全选"){
						for(var i = 0; i < check.length; i++) {
							if(check[i].checked == true){
								check[i].checked = false;
							}
						}
						select.value = "全 选";
					}
			  }
			
			/* 实现全删的js代码 */
			window.onload = function(){
				var delAll = document.getElementById('delAll');
				var check = document.getElementsByName("check");
				//用于存放要删除的ID
				var theID = new Array();
				delAll.onclick = function (){
					//点击全删按钮获取所有复选框
					if(confirm('确认全删除吗？')) {
						for(var i = 0; i < check.length; i++) {
							//当前复选框被勾选时，触发当前行的删除按钮点击事件
							if(check[i].checked == true){
								var ID = document.getElementById('the_'+i).innerText;
								theID.push(ID);
							}
						}
						//将数组传输到后台全删severlet
						window.location.href = '${pageContext.request.contextPath}/DataDeleteAllAction?arr='+theID;
			    		return true;
					} 
					return false;
				}
			}

			/* 判断查询项是否为空 */
			function find(){
				//判断查询内容输入框是否为空
				if(form.thefind.value == ""){
					alert("查询内容不能为空!");
					form.thefind.focus();
					return false; 
				}
				return ;
			}
			
			//用于确认删除动作的提示框
			function show(themas){ 
	  			var mas = themas;
				if(confirm('确认要删除？')) { 
					window.location.href = mas;
				    return true;
				} 
				return false; 
			 }
		</script> --%>
</html>
