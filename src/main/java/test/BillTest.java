package test;

import entity.TBillEntity;
import entity.TResidentsEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import service.BillService;
import tools.DateTool;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Component
public class BillTest {

    @Autowired
    private BillService billService;

    public void save(TBillEntity entity){
        billService.save(entity);
    }

    public TBillEntity findById(Integer i){
        TBillEntity entity = billService.findById(i);
        return entity;
    }

    public List<TBillEntity> findByTime(Timestamp begin, Timestamp end){
        return billService.findByTime(begin, end);
    }

    public List<TBillEntity> findByTime(Timestamp begin){
        return billService.findByTime(begin);
    }

    public List<TBillEntity> findAll(){
        return billService.findAll();
    }

    public List<TBillEntity> findByStatus(int status){
        return billService.findByStatus(status);
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BillTest billTest = (BillTest) context.getBean("billTest");
    }
}
