package service;

import entity.TBillEntity;
import entity.TResidentsEntity;

import java.sql.Timestamp;
import java.util.List;

public interface BillService extends BasicService<TBillEntity> {

    List<TBillEntity> findByTime(Timestamp begin, Timestamp end);
    List<TBillEntity> findByTime(Timestamp begin);
    List<TBillEntity> findByStatus(int status);
    TResidentsEntity isResident(int id);

}
