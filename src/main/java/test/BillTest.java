package test;

import entity.TBillEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import service.BillService;
import tools.DateTool;

import java.util.Date;

@Component
public class BillTest {

    @Autowired
    private BillService billService;

    public void update(){
        TBillEntity entity = new TBillEntity();
        entity.setBillId(2);
        entity.setBillMoney(10);
        entity.setBillStatus(0);
        entity.setBillTime(DateTool.dateToSqlDate(new Date()));
        entity.setResidentId(10000);
        entity.setBillType("电费");
        billService.update(entity);
    }

    public TBillEntity findById(Integer i){
        TBillEntity entity = billService.findById(i);
        return entity;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BillTest billTest = (BillTest) context.getBean("billTest");

        TBillEntity billEntity = billTest.findById(2);

        System.out.println(billEntity.toString());
    }
}
