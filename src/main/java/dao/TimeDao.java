package dao;

import java.sql.Timestamp;
import java.util.List;

public interface TimeDao<T> {

    List<T> findByTime(Timestamp begin, Timestamp end);
    List<T> findByTime(Timestamp begin);

}
