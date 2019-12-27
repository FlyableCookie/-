package test;

import entity.Page;
import entity.TBillEntity;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.object.SqlQuery;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
        Page page = context.getBean(Page.class);
//        Session session = sessionFactory.openSession();


//        Query query = session.createQuery("From TBillEntity");
//        query.setFirstResult(0);
//        query.setMaxResults(5);
//
//        List<TBillEntity> billEntityList = query.list();
//
//        for (TBillEntity entity : billEntityList){
//            System.out.println(entity.getBillId());
//        }

//        TBillEntity billEntity = session.get(TBillEntity.class, 16);

//        billEntity.setBillStatus(1);
//
//        Transaction transaction = session.beginTransaction();
//        session.update(billEntity);
//        transaction.commit();
    }

}
