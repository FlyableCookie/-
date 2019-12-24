package dao.impl;

import dao.BillDao;
import entity.TBillEntity;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BillDaoImpl extends TimeDaoImpl<TBillEntity> implements BillDao {

    @Override
    public Class<TBillEntity> getEntityClass() {
        return TBillEntity.class;
    }

    @Override
    public List<TBillEntity> findByStatus(int status) {
        String hql = "From "+getEntityClass().getName()+" Where billStatus = "+status;
        Query query = getSession().createQuery(hql);
        return query.list();
    }

}
