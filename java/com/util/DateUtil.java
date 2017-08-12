package com.util;
import java.util.Calendar;
import java.util.Date;

/**
 * @author  bryan quan
 */
public class DateUtil {

    public static final  String  HOUR="hour";
    public static final  String  MINITE="minite";
    public static final  String  SECOND="second";

    public  static java.sql.Date getSqlDate(Date date){
        if (!CommonUtil.isNull(date))
        {
            return  new java.sql.Date(date.getTime());
        }else {
            throw new UnsupportedOperationException("Cannot assign date null");
        }
    }

    /**
     * get hour of 12 hours displaying
     * @return
     */

   public static int getHour(){
       Calendar calendar=Calendar.getInstance();
       int hour=calendar.get(Calendar.HOUR);
       return hour;
   }

    /**
     * get hour of 24 hours displaying
     * @return
     */
   public static int getDayofHour(){
       Calendar calendar=Calendar.getInstance();
       int hour=calendar.get(Calendar.HOUR_OF_DAY);
       return hour;
   }
}
