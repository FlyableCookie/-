package dao.impl;

import dao.RepairDao;
import entity.TRepairEntity;
import org.springframework.stereotype.Repository;

@Repository
public class RepairDaoImpl extends BasicDaoImpl<TRepairEntity> implements RepairDao {

    @Override
    public Class getEntityClass() {
        return TRepairEntity.class;
    }

}
