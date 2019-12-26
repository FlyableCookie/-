package action.resident;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import entity.TResidentsEntity;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import service.ResidentService;

public class ResidentAction extends ActionSupport{
	private ResidentService residentService;
	private List<TResidentsEntity> resident;
	private int residentId;
	private String residentName;
    private String residentSex;
    private String IdNumber;
    private String PhoneNumber;
    private Timestamp CheckinTime;

	public void setResidentService(ResidentService residentService) {
		this.residentService = residentService;
	}
	
	public void setResident(List<TResidentsEntity> resident){
		this.resident = resident;
	}

	public List<TResidentsEntity> getResident() {
		return resident;
	}
	
	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getResidentSex() {
		return residentSex;
	}

	public void setResidentSex(String residentSex) {
		this.residentSex = residentSex;
	}
	
	public String getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(String IdNumber) {
		this.IdNumber = IdNumber;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	
	public Timestamp getCheckinTime() {
		return CheckinTime;
	}

	public void setCheckinTime(Timestamp CheckinTime) {
		this.CheckinTime = CheckinTime;
	}



	public String getAll() {
		resident = residentService.getAll();
        return "getAll";
    }
	

	public String findLike() {
		resident = residentService.getLike(residentName);
        return "findLike";
    }
	

	public String addNew() {
		System.out.println("INTO:addNew");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		HttpServletRequest request=ServletActionContext.getRequest();
		String userName = (String) request.getSession().getAttribute("userName");
		super.clearErrorsAndMessages();
		if("".equals(residentName) || residentName == null) {
			addActionError("请输入姓名");
			return "Addfalse";
		}
		if("".equals(residentSex) || residentSex == null) {
			addActionError("请输入性别");
			return "Addfalse";
		}
		if("".equals(IdNumber) || IdNumber == null) {
			addActionError("请输入居民ID");
			return "Addfalse";
		}
		if("".equals(PhoneNumber) || PhoneNumber == null) {
			addActionError("请输入电话号码");
			return "Addfalse";
		}
		TResidentsEntity residentEntity = new TResidentsEntity();
		residentEntity.setResidentName(String.valueOf(residentName));
		residentEntity.setResidentSex(String.valueOf(residentSex));
		residentEntity.setIdNumber(String.valueOf(IdNumber));
		residentEntity.setPhoneNumber(String.valueOf(PhoneNumber));
		residentEntity.setCheckinTime(new Timestamp(new Date().getTime()));
		residentEntity.setResidentId(residentService.theID(userName));
		if(residentService.addNew(residentEntity)){
			System.out.println("RETURN:SUCCESS");
			return "Addsuccess";
		} else {
			addActionError("添加失败");
			return "Addfalse";
		}
	}

	public String Delete() {
		if(residentService.delete(residentId)) {
			return "Delsuccess";
		}
		addActionError("删除失败");
		return "Delfalse";
	}
	

	public String Check() {
		TResidentsEntity residentEntity = new TResidentsEntity();
		residentEntity = residentService.getOne(residentId);
		residentName = residentEntity.getResidentName();
		residentSex = residentEntity.getResidentSex();
		IdNumber = residentEntity.getIdNumber();
		PhoneNumber = residentEntity.getPhoneNumber();
		CheckinTime = residentEntity.getCheckinTime();
	    return "Checksuccess";
	}
}