package user.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import entity.TUsersEntity;

public class UserDao {
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// 添加用户
	/*
	 * public boolean addUser(TUsersEntity user) {
	 * if(!verifyUsername(user.getUserName())) { hibernateTemplate.save(user);
	 * return true; } return false; }
	 */
	
	// 验证用户名是否存在
	public boolean verifyUsername(String username, String usertype) {
		List<TUsersEntity> users = (List<TUsersEntity>) hibernateTemplate.find("from TUsersEntity where userName=? and userType=?", username, usertype);
		return users.isEmpty() ? false:true;
	}
	
	// 验证密码是否正确
	public boolean verifyPassword(String username, String password, String usertype) {
		List queryList = hibernateTemplate.find("select userPwd from TUsersEntity where userName=? and userType=?", username, usertype);
		
		return ( queryList.get(0).toString() ).equals(password);
	}
}