package dao;

import entity.TBillEntity;

import java.util.List;

public interface BillDao extends BasicDao<TBillEntity>,TimeDao<TBillEntity> {

    public List<TBillEntity> findByStatus(int status);

}
