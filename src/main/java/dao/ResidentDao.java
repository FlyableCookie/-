package dao;

import java.util.List;

import entity.TResidentsEntity;
import org.springframework.orm.hibernate5.HibernateTemplate;
import entity.TUsersEntity;

public class ResidentDao {
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//添加居民
	public boolean addResident(TResidentsEntity resident) {
		System.out.println(resident.getResidentName());
		System.out.println(resident.getResidentSex());
		System.out.println(resident.getIdNumber());
		System.out.println(resident.getPhoneNumber());
		System.out.println(resident.getCheckinTime());
		hibernateTemplate.save(resident);
		return true;
	}
	
	//获取所有的居民信息
	public List<TResidentsEntity> theAll() {
		List<TResidentsEntity> resident = (List<TResidentsEntity>) hibernateTemplate.find("from TResidentsEntity");
		return resident;
	}
	
	//根据ID获取居民信息
	public List<TResidentsEntity> getResident(int residentId) {
		List<TResidentsEntity> resident = (List<TResidentsEntity>) hibernateTemplate.find("from TResidentsEntity where residentId='"+residentId+"'");
		return resident;
	}
	
	//根据居民姓名进行查询
	public List<TResidentsEntity> likeResident(String nameLike) {
		List<TResidentsEntity> likeresident = (List<TResidentsEntity>) hibernateTemplate.find("from TResidentsEntity where residentName like '%"+nameLike+"%'");
		return likeresident;
	}
	
	//删除居民信息
	public void deleteResident(TResidentsEntity resident) {
		hibernateTemplate.delete(resident);
	}
}