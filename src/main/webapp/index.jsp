<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录验证</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-3.3.7/css/bootstrap.min.css">    
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>    
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>  
<script type="text/javascript">
/* window.onload = function(){
	var msg = "${requestScope.message}";
	if(msg !== null && msg != ""){
		alert(msg);
	}
} */
</script>
<style type="text/css">
  .input-group{  
        margin:10px 0px; 
    }  
    h3{  
        padding:5px;  
        border-bottom:1px solid #ddd;  
    }  
    em{ 
        color:#c7254e;  
        font-style: inherit;  
        background-color: #f9f2f4;  
    }  
    .center{
       margin-left: auto;
       margin-right: auto;
       vertical-align:middle;
       text-align: center;
    }
    .top{
		width: 100%;
    	height: 60px;
    	background-color: black;
    	color: silver;
    	font-size: 23px;
    	font-family: '华文琥珀';
    }
    .buttom{
    	width: 100%;
    	height: 40px;
    	background-color: black;
    	position: fixed;
    	bottom:0px;
    	color: white;
    	font-size: 18px;
    	font-family: '黑体';
    	text-align: center;
    	font-weight: bold;
    	line-height: 40px;
    }
    a{
    	text-decoration: underline;
    }
</style>
</head>
<body style="background-image: url(${pageContext.request.contextPath}/image/登录.jpg)">
<div class="top">
	<img src="image/logo.png" style="max-width: 60px; max-height: 60px; margin-left: 10%;">
	&nbsp;小&nbsp;区&nbsp;物&nbsp;业&nbsp;管&nbsp;理&nbsp;系&nbsp;统
</div>

<div class="row center" style="margin-top:150px;">  
  <div class="col-md-5 col-sm-offset-4">  
    <div class="well col-md-10">  
       <h3>用户登录</h3>  
      
       <form action="${pageContext.request.contextPath}/loginAction.action" method="post" onsubmit="return check()">
       		
		    <div class="input-group input-group-md">  
		          <span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-user" aria-hidden="true"></i></span>  
		          <input type="text" class="form-control" id="uname" name="userName" placeholder="用户名" aria-describedby="sizing-addon1">
		    </div>
		    <div class="input-group input-group-md">  
		          <span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-lock"></i></span>  
		          <input type="password" class="form-control" id="upassword" name="userPwd" placeholder="密码" aria-describedby="sizing-addon1">  
		    </div>  
		    
		    <div>
				<input type="radio" name="userType" value="0" checked="checked" style="margin-left:5px;"><span>普通居民</span>
				<input type="radio" name="userType" value="1"  style="margin-left:5px;"><span>物业管理员</span>
				<input type="radio" name="userType" value="2"  style="margin-left:5px;"><span>系统管理员</span>
			</div><br/>
			
		    
		    <input type="submit" name="sub" class="btn btn-success btn-block" value="登录"/>
		    
		    <div style="margin-top:7px;">
		    	<span style="margin-left:5px;"><a href="#">忘记密码</a></span>
		    	<span><a href="${pageContext.request.contextPath}/regist.jsp">用户注册</a></span>
		    </div>
	    </form>
    </div>  
  </div>  
</div>  
<div class="buttom">成&nbsp;都&nbsp;信&nbsp;息&nbsp;工&nbsp;程&nbsp;大&nbsp;学</div>
</body>
</html>