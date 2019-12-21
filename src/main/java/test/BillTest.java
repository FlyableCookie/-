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

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BillTest billTest = (BillTest) context.getBean("billTest");

//        List<TBillEntity> billEntityList = billTest.findByTime(
//                DateTool.strToSqlDate("2019-12-07", "yyyy-MM-dd"),
//                DateTool.dateToSqlDate(new Date())
//        );

        List<TBillEntity> billEntityList = billTest.findAll();
//
////        List<TBillEntity> billEntityList = billTest.findByTime(
////                DateTool.strToSqlDate("2019-12-01", "yyyy-MM-dd"));
//
        for (TBillEntity b : billEntityList){
            System.out.println(b.toString());
            System.out.println("ResidentName ===== "+b.getResidentsEntity().getResidentName());
        }

//        TBillEntity entity = new TBillEntity();
//
//        TResidentsEntity residentsEntity = new TResidentsEntity();
////        residentsEntity.setResidentId(10000);
////        residentsEntity.setResidentName("力宏");
////        residentsEntity.setResidentSex("男");
////        residentsEntity.setIdNumber("000001");
////        residentsEntity.setPhoneNumber("111110");
////        residentsEntity.setCheckinTime(DateTool.strToSqlDate("2019-12-06", "yyyy-MM-dd"));
//
//        entity.setBillType("水费");
//        entity.setBillTime(DateTool.dateToSqlDate(new Date()));
//        entity.setBillMoney(2000);
//        entity.setResidentsEntity(residentsEntity);
//
//        billTest.save(entity);

    }
}
