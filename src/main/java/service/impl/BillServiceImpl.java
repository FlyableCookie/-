package service.impl;

import dao.BillDao;
import entity.TBillEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.BillService;

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
}
