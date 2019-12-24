package service.impl;

import dao.EmployeeDao;
import entity.TEmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.EmployeeService;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void save(TEmployeeEntity entity) {
    	employeeDao.save(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void update(TEmployeeEntity entity) {
    	employeeDao.update(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void delete(Integer integer) {
    	employeeDao.delete(integer);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public TEmployeeEntity findById(Integer i) {
        return employeeDao.findById(i);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<TEmployeeEntity> findAll() {
        return employeeDao.findAll();
    }
}
