package action.bill;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import service.RepairService;

public class RepairAction extends ActionSupport {

    @Autowired
    private RepairService repairService;

}
