package action.user;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

//import java.util.Map;

//import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import entity.TUsersEntity;
import service.UserService;

public class LoginAction extends ActionSupport{
	private UserService userService;
	private String userName;
	private String userPwd;
	private String userType;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String execute() {
		super.clearErrorsAndMessages();
		if("".equals(userName) || userName == null) {
			addActionError("姓名不能为空");
			return "loginfalse";
		}
		if("".equals(userPwd) || userType == null) {
			addActionError("密码不能为空");
			return "loginfalse";
		}
		if(userService.loginVerify(userName, userPwd, userType)){
			HttpServletRequest request=ServletActionContext.getRequest();
			request.getSession().setAttribute("userName", userName);
			request.getSession().setAttribute("userType", userType);
			return "loginsuccess";
		} else {
			addActionError("登录失败");
			return "loginfalse";
		}
	}
}