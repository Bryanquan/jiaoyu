package com.util;

import java.util.Calendar;

/**
 * the util class for calendar
 * @ bryan quan
 */
public class CalendarUtil {

    public static final String YEAR="year";
    public static final String MONTH="month";
    public static final String DAYOFMonth="dayofmonth";
    public static final String DAYOFYEAR="dayofyear";

    public static int getYear(){
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        return year;
    }

    public static int getMonth(){
        Calendar calendar=Calendar.getInstance();
        int month=calendar.get(Calendar.MONTH);
        return month;
    }

    /**
     * get the day of current month
     * @return
     */
    public static int getDayofMonth(){
        Calendar calendar=Calendar.getInstance();
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        return day;
    }

    /**
     * get the day of current year
     * @return
     */
    public static int getDayofYear(){
        Calendar calendar=Calendar.getInstance();
        int day=calendar.get(Calendar.DAY_OF_YEAR);
        return day;
    }

    /**
     * get the day of current week
     * @return
     */
    public static int getDayofWeek(){
        Calendar calendar=Calendar.getInstance();
        int day=calendar.get(Calendar.DAY_OF_WEEK);
        return day;
    }

    /**
     *
     * @return the day before of week
     */
    public static int getPreDayofWeek(){
       return getDayofWeek()-1;
    }

    /**
     *
     * @return the day before of month
     */
    public static int getPreDayofMonth(){
       return getDayofMonth()-1;
    }

    /**
     * get the day before of year
     * @return
     */
    public static int getPreDayofYear(){
        return getDayofYear()-1;
    }

    /**
     * get the day tomorrow of month
     * @return
     */
    public static int getNextDayofMonth(){
      return getDayofMonth()+1;
    }

    public static int getNextDayofWeek(){
        return getDayofWeek()+1;
    }

    public static int getNextDayofYear(){
        return getDayofYear()+1;
    }

    public static String getYearMonthDay(){
        return ""+getYear()+getMonth()+getDayofMonth()+"";
    }

    public static String getYearMonth(){
        return ""+getYear()+getMonth()+"";
    }

    public static String getMonthDay(){
        return ""+getMonth()+getDayofMonth()+"";
    }
}
