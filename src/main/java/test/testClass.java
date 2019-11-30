package test;

import entity.TEmployeeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class testClass {

    @Test
    public void save(){
        TEmployeeEntity employee = new TEmployeeEntity();
        employee.setEmployeeName("test");
        employee.setEmployeeSex("test");
        employee.setIdNumber("test");
        employee.setPhoneNumber("test");
        employee.setPosition("test");

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
