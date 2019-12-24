package intercept;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class AnnounIntercept extends MethodFilterInterceptor {
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		
		//判断session里面登录用户的等级是否是1
		//得到session
		HttpServletRequest request = ServletActionContext.getRequest();
		String usertype = (String) request.getSession().getAttribute("userType");
		System.out.println(usertype);
		//判断
		if(usertype != null && usertype.equals("1")) {
			//登陆状态且登陆等级为1
			//执行类似放行的操作
			return arg0.invoke();
		}
		else {
			request.getSession().setAttribute("error","您的权限不够！");
			return "getAll";
		} 
	}
}
