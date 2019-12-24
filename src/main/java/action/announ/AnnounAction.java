package action.announ;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.TAnnounEntity;
import service.AnnounService;

public class AnnounAction extends ActionSupport{
	private AnnounService announService;
	private List<TAnnounEntity> announ;
	private int announId;
	private String announTitle;
    private String announContent;
    private Timestamp announTime;
    private int employeeID;

	public void setAnnounService(AnnounService announService) {
		this.announService = announService;
	}
	
	public void setAnnoun(List<TAnnounEntity> announ){
		this.announ = announ;
	}
	//��get����������action�л�ȡֵջ
	public List<TAnnounEntity> getAnnoun() {
		return announ;
	}
	
	public int getAnnounId() {
		return announId;
	}

	public void setAnnounId(int announId) {
		this.announId = announId;
	}

	public String getAnnounTitle() {
		return announTitle;
	}

	public void setAnnounTitle(String announTitle) {
		this.announTitle = announTitle;
	}

	public String getAnnounContent() {
		return announContent;
	}

	public void setAnnounContent(String announContent) {
		this.announContent = announContent;
	}
	
	public Timestamp getAnnounTime() {
		return announTime;
	}

	public void setAnnounTime(Timestamp announTime) {
		this.announTime = announTime;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	//��ȡ����������
	public String getAll() {
		announ = announService.getAll();
        return "getAll";
    }
	
	//��ȡ��ѯ��Ϣ��ص�����
	public String findLike() {
		announ = announService.getLike(announTitle);
        return "findLike";
    }
	
	//����µĹ�����Ϣ
	public String addNew() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		HttpServletRequest request=ServletActionContext.getRequest();
		String userName = (String) request.getSession().getAttribute("userName");
		super.clearErrorsAndMessages();
		if("".equals(announTitle) || announTitle == null) {
			addActionError("������ⲻ��Ϊ��");
			return "Addfalse";
		}
		if("".equals(announContent) || announContent == null) {
			addActionError("�������ݲ���Ϊ��");
			return "Addfalse";
		}
		TAnnounEntity announEntity = new TAnnounEntity();
		announEntity.setAnnounTitle(String.valueOf(announTitle));
		announEntity.setAnnounContent(String.valueOf(announContent));
		announEntity.setAnnounTime(new Timestamp(new Date().getTime()));
		announEntity.setEmployeeID(announService.theID(userName));
		if(announService.addNew(announEntity)){
			return "Addsuccess";
		} else {
			addActionError("����ʧ��");
			return "Addfalse";
		}
	}
	
	//ɾ������
	public String Delete() {
		if(announService.delete(announId)) {
			return "Delsuccess";
		}
		addActionError("ɾ��ʧ��");
		return "Delfalse";
	}
	
	//�鿴����
	public String Check() {
		TAnnounEntity announEntity = new TAnnounEntity();
		announEntity = announService.getOne(announId);
		announTitle = announEntity.getAnnounTitle();
	    announContent = announEntity.getAnnounContent();
	    announTime = announEntity.getAnnounTime();
	    employeeID = announEntity.getEmployeeID();
	    return "Checksuccess";
	}
}