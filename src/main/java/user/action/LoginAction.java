package user.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import entity.TUsersEntity;
import user.service.UserService;

public class LoginAction extends ActionSupport implements SessionAware {
	private UserService userService;
	private String userName;
	private String userPwd;
	private String userType;
	private Map session;
	
    public void setSession(Map session) {  
        this.session = session;  
    }  
	
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

	public void validate() {
		super.clearErrorsAndMessages();
		if("".equals(userName)) {
			super.addActionError("用户名不能为空！");
		}
		if("".equals(userPwd)) {
			super.addActionError("密码不能为空！");
		}
	}
	
	public String execute() {
		if(userService.loginVerify(userName, userPwd, userType)){
			TUsersEntity user = new TUsersEntity();
			user.setUserName(userName);
			user.setUserPwd(userPwd);
			user.setUserType(userType);
			session.put("user", user);
			return "success";
		} else {
			super.addActionError("登录失败！");
			return INPUT;
		}
	}
}