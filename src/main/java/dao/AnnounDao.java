package dao;

import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import entity.TEmployeeEntity;
import entity.TUsersEntity;
import entity.TAnnounEntity;

public class AnnounDao {
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//执行添加新公告
	public boolean addAnnoun(TAnnounEntity announ) {
		if(verifyEmployee(announ.getEmployeeID())) { 
			System.out.println(announ.getAnnounTitle());
			System.out.println(announ.getAnnounContent());
			System.out.println(announ.getAnnounTime());
			System.out.println(announ.getEmployeeID());
			hibernateTemplate.save(announ);
			return true;
		}
		return false; 
	}
	
	//获取当前登录用户的关联编号
	public int associateID(String username, String usertype) {
		List<TUsersEntity> users = (List<TUsersEntity>) hibernateTemplate.find("from TUsersEntity where userName='"+username+"' and userType='"+usertype+"'");
		return users.get(0).getAssociatedId();
	}
	
	//判断物业管理员是否存在
	public boolean verifyEmployee(int employeeId) {
		List<TEmployeeEntity> employee = (List<TEmployeeEntity>) hibernateTemplate.find("from TEmployeeEntity where employeeId='"+employeeId+"'");
		return employee.isEmpty() ? false:true;
	}
	
	//获取全部公告信息
	public List<TAnnounEntity> theAll() {
		List<TAnnounEntity> announ = (List<TAnnounEntity>) hibernateTemplate.find("from TAnnounEntity");
		return announ;
	}
	
	//根据ID编号获取物业消息
	public List<TAnnounEntity> getAnnoun(int announId) {
		List<TAnnounEntity> announ = (List<TAnnounEntity>) hibernateTemplate.find("from TAnnounEntity where announId='"+announId+"'");
		return announ;
	}
	
	//根据物业标题进行类查询
	public List<TAnnounEntity> likeAnnoun(String titleLike) {
		List<TAnnounEntity> likeannoun = (List<TAnnounEntity>) hibernateTemplate.find("from TAnnounEntity where announTitle like '%"+titleLike+"%'");
		return likeannoun;
	}
	
	//删除该物业消息
	public void deleteAnnoun(TAnnounEntity announ) {
		hibernateTemplate.delete(announ);
	}
}