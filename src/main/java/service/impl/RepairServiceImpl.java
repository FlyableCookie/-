package service.impl;

import dao.RepairDao;
import entity.TRepairEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.RepairService;

import java.util.List;

@Service
@Transactional
public class RepairServiceImpl implements RepairService {

    @Autowired
    private RepairDao repairDao;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void save(TRepairEntity entity) {
        repairDao.save(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void update(TRepairEntity entity) {
        repairDao.update(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void delete(Integer integer) {
        repairDao.delete(integer);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public TRepairEntity findById(Integer integer) {
        return repairDao.findById(integer);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<TRepairEntity> findAll() {
        return repairDao.findAll();
    }
}
