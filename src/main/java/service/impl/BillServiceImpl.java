package service.impl;

import dao.BillDao;
import entity.TBillEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.BillService;

import java.sql.Timestamp;
import java.util.List;

@Service
@Transactional
public class BillServiceImpl implements BillService {

    @Autowired
    private BillDao billDao;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void save(TBillEntity entity) {
        billDao.save(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void update(TBillEntity entity) {
        entity = billDao.findById(entity.getBillId());
        entity.setBillStatus(1);
        billDao.update(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void delete(Integer integer) {
        billDao.delete(integer);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public TBillEntity findById(Integer i) {
        return billDao.findById(i);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<TBillEntity> findAll() {
        return billDao.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<TBillEntity> findByTime(Timestamp begin, Timestamp end) {
        return billDao.findByTime(begin, end);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<TBillEntity> findByTime(Timestamp begin) {
        return billDao.findByTime(begin);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<TBillEntity> findByStatus(int status){
        return billDao.findByStatus(status);
    }

}
