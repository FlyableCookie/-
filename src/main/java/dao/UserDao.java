package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import entity.TUsersEntity;
import entity.TEmployeeEntity;
import entity.TResidentsEntity;

public class UserDao {
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//执行添加新用户
	public boolean addUser(TUsersEntity user) {
		if(!verifyUsername(user.getUserName(), user.getUserType())) { 
			if(verifyAssociateID(user.getAssociatedId(),user.getUserType())) {
				//未重名的同时关联编号存在
				hibernateTemplate.save(user);
				return true; 
			}
		 }
		return false; 
	}
	 
	//判断用户是否存在
	public boolean verifyUsername(String username, String usertype) {
		List<TUsersEntity> users = (List<TUsersEntity>) hibernateTemplate.find("from TUsersEntity where userName='"+username+"' and userType='"+usertype+"'");
		return users.isEmpty() ? false:true;
	}
	
	//判断密码是否正确
	public boolean verifyPassword(String username, String password, String usertype) {
		List queryList = hibernateTemplate.find("select userPwd from TUsersEntity where userName='"+username+"' and userType='"+usertype+"'");
		return ( queryList.get(0).toString() ).equals(password);
	}
	
	//判断关联编号是否存在
	public <T> boolean verifyAssociateID(int associate,String usertype) {
		//查询普通居民关联编号
		List<T> list = new ArrayList<T>();
		if(usertype.equals("0")) {
			list = (List<T>) hibernateTemplate.find("from TResidentsEntity where residentId='"+associate+"'");
		}
		//查询业务管理员关联编号
		else if(usertype.equals("1")) {
			list = (List<T>) hibernateTemplate.find("from TEmployeeEntity where employeeId='"+associate+"'");
		}
		return list.isEmpty() ? false:true;
	}
}