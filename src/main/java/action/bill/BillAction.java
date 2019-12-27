package action.bill;

import com.opensymphony.xwork2.ActionSupport;
import entity.TBillEntity;
import entity.TEmployeeEntity;
import entity.TResidentsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import service.BillService;
import service.EmployeeService;
import tools.DateTool;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillAction extends ActionSupport {

    @Autowired
    private BillService billService;

    private String saveResult = "";

    private TBillEntity billEntity;
    private List<TBillEntity> billEntityList;
    private Integer integer;

    public String getBill() {
        billEntity = billService.findById(integer);
        if (billEntityList == null){
            billEntityList = new ArrayList<>();
        } else {
            billEntityList.clear();
        }
        billEntityList.add(billEntity);
        return SUCCESS;
    }

    public String getBillList() {
        billEntityList = billService.findAll();
        return SUCCESS;
    }

    public String getBillByStatus(){
        billEntityList = billService.findByStatus(integer);
        return SUCCESS;
    }

    public String saveBill() throws Exception {
        if (!saveResult.equals("")){
            saveResult = "";
        }
        if (billEntity != null){
            TResidentsEntity entity = billService.isResident(billEntity.getResidentsEntity().getResidentId());
            if (entity == null){
                saveResult = "failure";
                return SUCCESS;
            }
            billEntity.setBillTime(DateTool.dateToSqlDate(new Date()));
            billEntity.setBillStatus(0);
            billService.save(billEntity);
        }
        saveResult = "success";
        return SUCCESS;
    }

    public String updateBill() throws Exception {
        if (billEntity != null) {
            billService.update(billEntity);
        }
        return SUCCESS;
    }

    public String deleteBill() throws Exception {
        billService.delete(integer);
        return SUCCESS;
    }





    // get set方法
    public String getSaveResult() {
        return saveResult;
    }

    public void setSaveResult(String saveResult) {
        this.saveResult = saveResult;
    }

    public BillService getBillService() {
        return billService;
    }

    public void setBillService(BillService billService) {
        this.billService = billService;
    }

    public TBillEntity getBillEntity() {
        return billEntity;
    }

    public void setBillEntity(TBillEntity billEntity) {
        this.billEntity = billEntity;
    }

    public List<TBillEntity> getBillEntityList() {
        return billEntityList;
    }

    public void setBillEntityList(List<TBillEntity> billEntityList) {
        this.billEntityList = billEntityList;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }
}
