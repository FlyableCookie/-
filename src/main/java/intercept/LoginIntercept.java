package intercept;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginIntercept extends MethodFilterInterceptor {
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		
		//判断session里面是否有username的值
		//得到session
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = (String) request.getSession().getAttribute("userName");
		System.out.println(username);
		
		//判断
		if(username != null && !username.equals("")) {
			//登陆状态
			//执行类似放行的操作
			return arg0.invoke();
		} else {
			//不是登陆状态
			//返回登录界面，返回值为login
			return "login";
		}
		
	}
	
}
