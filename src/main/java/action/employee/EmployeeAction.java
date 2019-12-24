package action.employee;

import com.opensymphony.xwork2.ActionSupport;
import entity.TEmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import service.EmployeeService;

import java.util.List;

public class EmployeeAction extends ActionSupport {

    @Autowired
    private EmployeeService employeeService;

    private TEmployeeEntity employeeEntity;
    private List<TEmployeeEntity> employeeEntityList;
    private Integer integer;
    private int result;

    public String getEmployee() throws Exception {
    	employeeEntity = employeeService.findById(integer);
        if (employeeEntityList != null){
        	employeeEntityList.clear();
        }
        employeeEntityList.add(employeeEntity);
        return SUCCESS;
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
        result = 0;
        if (employeeEntity != null) {
        	employeeService.delete(integer);
            result = 1;
            return "delete";
        }
        return "FALSE";
    }




    // get set方法
    public EmployeeService getEntityService() {
        return employeeService;
    }

    public void setEntityService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public TEmployeeEntity getEntityEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(TEmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public List<TEmployeeEntity> getBillEntityList() {
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
}

