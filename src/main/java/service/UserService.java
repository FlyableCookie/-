package service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.TUsersEntity;
import dao.UserDao;

@Transactional
@Service("UserService")
public class UserService {
	private UserDao userDao;
//	private TUsersEntity user;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
//	public void setTUsersEntity(TUsersEntity user) {
//		this.user = user;
//	}
	
	//验证登录
	public boolean loginVerify(String username, String password, String usertype) {
		boolean passLogin = false;
		passLogin = userDao.verifyUsername(username,usertype);
		if(passLogin) {
			passLogin = userDao.verifyPassword(username, password, usertype);
		}
		return passLogin;
	}
	
	//验证注册
	public boolean userRegister(TUsersEntity user) {
//		user.setUserName(username);
//		user.setUserPwd(password);
		return userDao.addUser(user);
	}
}