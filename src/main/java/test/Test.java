package test;

import entity.TBillEntity;
import entity.TResidentsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.management.Query;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//
//        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
//        Session session = sessionFactory.openSession();
//
////        TResidentsEntity entity = new TResidentsEntity();
////        entity = session.get(TResidentsEntity.class, 10000);
////
////        for (TBillEntity entity1 : entity.getBillEntities()){
////            System.out.println(entity1.getBillId());
////        }
//
//        List<TBillEntity> entity = session.createQuery("From TBillEntity").list();
//        TResidentsEntity entity1 = entity.get(1).getResidentsEntity();
//        System.out.println(entity1.getResidentName());

    }

}
