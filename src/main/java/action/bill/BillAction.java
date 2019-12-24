package action.bill;

import com.opensymphony.xwork2.ActionSupport;
import entity.TBillEntity;
import org.springframework.beans.factory.annotation.Autowired;
import service.BillService;
import tools.DateTool;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillAction extends ActionSupport {

    @Autowired
    private BillService billService;

    private TBillEntity billEntity;
    private List<TBillEntity> billEntityList;
    private Integer integer;
    private int result;

    public String getBill() {
        billEntity = billService.findById(integer);
        System.out.println(billEntity.toString());
        System.out.println(billEntity.getResidentsEntity().getResidentName());
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
        result = 0;
        if (billEntity != null){
            billEntity.setBillTime(DateTool.dateToSqlDate(new Date()));
            billEntity.setBillStatus(0);
            billService.save(billEntity);
        }
        result = 1;
        return SUCCESS;
    }

    public String updateBill() throws Exception {
        result = 0;
        if (billEntity != null) {
            billService.update(billEntity);
        }
        result = 1;
        return SUCCESS;
    }

    public String deleteBill() throws Exception {
        result = 1;
        billService.delete(integer);
        return SUCCESS;
    }





    // get set方法
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
