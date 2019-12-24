package dao.impl;

import dao.EmployeeDao;
import entity.TEmployeeEntity;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl extends BasicDaoImpl<TEmployeeEntity> implements EmployeeDao {

    @Override
    public Class<TEmployeeEntity> getEntityClass() {
        return TEmployeeEntity.class;
    }

}