package action.user;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import service.UserService;
import entity.TUsersEntity;

public class RegisterAction extends ActionSupport {
	private UserService userService;
//	private TUsersEntity user;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
//	public void setTUsersEntity(TUsersEntity user) {
//		this.user = user;
//	}
	
	private String userName;
    private String userPwd;
    private String reUserPwd;
    private String userType;
    private int associatedId;
    private Timestamp createDate;

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

	public String getReUserPwd() {
		return reUserPwd;
	}

	public void setReUserPwd(String reUserPwd) {
		this.reUserPwd = reUserPwd;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getAssociatedId() {
		return associatedId;
	}

	public void setAssociatedId(int associatedId) {
		this.associatedId = associatedId;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public UserService getUserService() {
		return userService;
	}

	public String execute() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		super.clearErrorsAndMessages();
		if("".equals(userName) || userName == null) {
			addActionError("�û�������Ϊ�գ�");
			return "false";
		}
		if("".equals(userPwd) || userPwd == null || "".equals(reUserPwd) || reUserPwd == null) {
			addActionError("���벻��Ϊ�գ�");
			return "false";
		}
		if(!userPwd.equals(reUserPwd)) {
			addActionError("�������벻һ�£�");
			return "false";
		}
		TUsersEntity user = new TUsersEntity(); 
		user.setUserName(userName);
		user.setUserPwd(userPwd);
		user.setUserType(userType);
		user.setAssociatedId(associatedId);
		user.setCreateDate(new Timestamp(new Date().getTime()));
		if(userService.userRegister(user)) {
			super.addActionMessage("ע��ɹ���");
		} else {
			super.addActionError("ע��ʧ��,���û����Ѵ��ڻ������Ų����ڣ�");
			return "false";
		}
		return "success";
	}
}
