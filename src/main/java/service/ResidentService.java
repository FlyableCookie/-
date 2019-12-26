package service;

import java.util.List;

import entity.TResidentsEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ResidentDao;

@Transactional
@Service("ResidentService")
public class ResidentService {
	private ResidentDao residentDao;
	private TResidentsEntity resident;
	
	public TResidentsEntity getResident() {
		return resident;
	}

	public void setResident(TResidentsEntity resident) {
		this.resident = resident;
	}

	public void setResidentDao(ResidentDao residentDao) {
		this.residentDao = residentDao;
	}
	
	public List<TResidentsEntity> getAll() {
		List<TResidentsEntity> resident =  residentDao.theAll();
		return resident;
	}
	
	public List<TResidentsEntity> getLike(String nameLike) {
		List<TResidentsEntity> likeresident =  residentDao.likeResident(nameLike);
		return likeresident;
	}
	
	public boolean addNew(TResidentsEntity resident) {
		System.out.println("222");
		if(residentDao.addResident(resident)) {
			System.out.println("333");
			return true;
		}
		return false;
	}
	
	public boolean delete(int residentId) {
		if(residentDao.getResident(residentId).isEmpty()) {
			return false;
		}
		residentDao.deleteResident(residentDao.getResident(residentId).get(0));
		return true;
	}
	
	public TResidentsEntity getOne(int residentId) {
		return residentDao.getResident(residentId).get(0);
	}
}