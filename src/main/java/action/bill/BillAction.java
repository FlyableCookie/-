package action.bill;

import com.opensymphony.xwork2.ActionSupport;
import entity.TBillEntity;
import org.springframework.beans.factory.annotation.Autowired;
import service.BillService;

import java.util.List;

public class BillAction extends ActionSupport {

    @Autowired
    private BillService billService;

    private TBillEntity billEntity;
    private List<TBillEntity> billEntityList;
    private Integer integer;
    private int result;

    public String getBill() throws Exception {
        billEntity = billService.findById(integer);
        if (billEntityList != null){
            billEntityList.clear();
        }
        billEntityList.add(billEntity);
        return SUCCESS;
    }

    public String getBillList() throws Exception {
        billEntityList = billService.findAll();
        return SUCCESS;
    }

    public String saveBill() throws Exception {
        result = 0;
        if (billEntity != null){
            billService.save(billEntity);
            result = 1;
            return SUCCESS;
        }
        return "FALSE";
    }

    public String updateBill() throws Exception {
        result = 0;
        if (billEntity != null) {
            billService.update(billEntity);
            result = 1;
            return SUCCESS;
        }
        return "FALSE";
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
