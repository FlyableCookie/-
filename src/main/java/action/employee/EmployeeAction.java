package action.employee;

import com.opensymphony.xwork2.ActionSupport;
import entity.TEmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAction extends ActionSupport {

    @Autowired
    private EmployeeService employeeService;

    private TEmployeeEntity employeeEntity;
    private List<TEmployeeEntity> employeeEntityList;
    private Integer integer;
    private int result;


	public String gotEmployee() throws Exception {
		System.out.println(integer);
    	employeeEntity = employeeService.findById(integer);
    	System.out.println(employeeEntity.getEmployeeName());
    	if (employeeEntityList == null){
    		employeeEntityList = new ArrayList<>();
        } else {
        	employeeEntityList.clear();
        }
        employeeEntityList.add(employeeEntity);
        return "getemp";
    }

    public String getEntityList() throws Exception {
    	employeeEntityList = employeeService.findAll();
        return "list";
    }

    public String saveEntity() throws Exception {
        result = 0;
        if (employeeEntity != null){
        	employeeService.save(employeeEntity);
            result = 1;
            return "input";
        }
        return "FALSE";
    }

	public String updateEntity() throws Exception {
        result = 0;
        if (employeeEntity != null) {
        	employeeService.update(employeeEntity);
            result = 1;
            return "update";
        }
        return "FALSE";
    }
    
    
    public String deleteEntity() throws Exception {
        	employeeService.delete(integer);
            return "delete";
    }
    
    
    public String tianjia() throws Exception {
        return "tianjia";
}
    
    public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public TEmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}

	public void setEmployeeEntity(TEmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}

	public List<TEmployeeEntity> getEmployeeEntityList() {
		return employeeEntityList;
	}

	public void setEmployeeEntityList(List<TEmployeeEntity> employeeEntityList) {
		this.employeeEntityList = employeeEntityList;
	}

	public Integer getInteger() {
		return integer;
	}

	public void setInteger(Integer integer) {
		this.integer = integer;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}

