package action.repair;

import com.opensymphony.xwork2.ActionSupport;
import entity.TRepairEntity;
import org.springframework.beans.factory.annotation.Autowired;
import service.RepairService;

import java.util.List;

public class RepairAction extends ActionSupport {

    @Autowired
    private RepairService repairService;

    private TRepairEntity repairEntity;
    private List<TRepairEntity> repairEntityList;
    private Integer integer;

    public String saveRepair() {
        return SUCCESS;
    }

    public String updateRepair() {
        return SUCCESS;
    }

    public String getRepair() {
        return SUCCESS;
    }

    public String getRepairList() {
        return SUCCESS;
    }



    //get set
    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public List<TRepairEntity> getRepairEntityList() {
        return repairEntityList;
    }

    public void setRepairEntity(TRepairEntity repairEntity) {
        this.repairEntity = repairEntity;
    }

    public RepairService getRepairService() {
        return repairService;
    }

    public void setRepairEntityList(List<TRepairEntity> repairEntityList) {
        this.repairEntityList = repairEntityList;
    }

    public TRepairEntity getRepairEntity() {
        return repairEntity;
    }

    public void setRepairService(RepairService repairService) {
        this.repairService = repairService;
    }

}
