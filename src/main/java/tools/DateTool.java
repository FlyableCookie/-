package tools;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTool {

    public static String dateToStr(Date date, String strFormat){
        SimpleDateFormat sf = new SimpleDateFormat(strFormat);
        String str = sf.format(date);
        return str;
    }

    public static Date strToDate(String strDate, String dateFormat){
        SimpleDateFormat sf = new SimpleDateFormat(dateFormat);
        Date date = null;
        try {
            date = sf.parse(strDate);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return date;
    }

    public static String dateToStr(Timestamp time, String strFormat){
        DateFormat df = new SimpleDateFormat(strFormat);
        String str = df.format(time);
        return str;
    }

    public static Timestamp strToSqlDate(String strDate, String dateFormat){
        Date date = strToDate(strDate, dateFormat);
        Timestamp sqlDate = new Timestamp(date.getTime());
        return sqlDate;
    }

    public static Timestamp dateToSqlDate(Date date){
        String strDate = dateToStr(date, "yyyy-MM-dd HH:mm:ss SSS");
        return strToSqlDate(strDate, "yyy-MM-dd HH:mm:ss SSS");
    }

    public static Date timeToDate(Timestamp time){
        return time;
    }
}
