package user.service;

import org.springframework.transaction.annotation.Transactional;

import entity.TUsersEntity;
import user.dao.UserDao;

public class UserService {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public boolean loginVerify(String username, String password, String usertype) {
		boolean passLogin = false;
		passLogin = userDao.verifyUsername(username,usertype);
		if(passLogin) {
			passLogin = userDao.verifyPassword(username, password, usertype);
		}
		return passLogin;
	}
	
	/*public boolean userRegister(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return userDao.addUser(user);
	}*/
}