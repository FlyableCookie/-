package service;

import entity.TBillEntity;

import java.sql.Timestamp;
import java.util.List;

public interface BillService extends BasicService<TBillEntity> {

    List<TBillEntity> findByTime(Timestamp begin, Timestamp end);
    List<TBillEntity> findByTime(Timestamp begin);
    List<TBillEntity> findByStatus(int status);

}
