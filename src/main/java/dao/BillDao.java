package dao;

import entity.Page;
import entity.TBillEntity;
import entity.TResidentsEntity;

import java.util.List;

public interface BillDao extends BasicDao<TBillEntity>,TimeDao<TBillEntity> {

    List<TBillEntity> findByStatus(int status);
    TResidentsEntity isResident(int id);
    List<TBillEntity> byPage(Page page);

}
