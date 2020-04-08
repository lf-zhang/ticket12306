package cn.train.util;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

    public final static String shortFormat = "yyyyMMdd";
    public final static String longFormat = "yyyyMMddHHmmss";
    public final static String milliSecondFormat = "yyyyMMddHHmmssSSS";
    public final static String webFormat = "yyyy-MM-dd";
    public final static String timeFormat = "HHmmss";
    public final static String monthFormat = "yyyyMM";
    public final static String chineseDtFormat = "yyyy年MM月dd日";

    public final static String newFormat = "yyyy-MM-dd";
    public final static String zbFormat = "yyyy/MM/dd";
    public final static String tsfxFormat = "yyyy.MM.dd";
    public final static String noSecondFormat = "yyyy-MM-dd HH:mm";
    public final static String secondFormat = "yyyy-MM-dd HH:mm:ss";
    public final static String milliSecondFormat2 = "yyyy-MM-dd HH:mm:ss.SSS";
    public final static String DATE_TIME_FORMAT = "yyyy-MM-ddTHH:mm:ss";
    public final static long ONE_DAY_MILL_SECONDS = 86400000;

    /**
     * Date类型转为 格林历
     * @param date Date
     * @return XMLGregorianCalendar
     */
    public static XMLGregorianCalendar toGregorianCalendar(Date date) {
        if(date==null){
            return null;
        }
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar gc = null;
        try {
            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gc;
    }


    // -----------------------------------------------------------------------
    /**
     * Adds to a date returning a new object. The original date object is
     * unchanged.
     *
     * @param date
     *            the date, not null
     * @param calendarField
     *            the calendar field to add to
     * @param amount
     *            the amount to add, may be negative
     * @return the new date object with the amount added
     * @throws IllegalArgumentException
     *             if the date is null
     */
    public static Date add(Date date, int calendarField, int amount) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(calendarField, amount);
        return c.getTime();
    }

    public static Date addYears(Date date, int amount) {
        return add(date, Calendar.YEAR, amount);
    }

    public static Date addMonths(Date date, int amount) {
        return add(date, Calendar.MONTH, amount);
    }

    public static Date addWeeks(Date date, int amount) {
        return add(date, Calendar.WEEK_OF_YEAR, amount);
    }

    public static Date addDays(Date date, int amount) {
        return add(date, Calendar.DAY_OF_MONTH, amount);
    }

    public static Date addHours(Date date, int amount) {
        return add(date, Calendar.HOUR_OF_DAY, amount);
    }

    public static Date addMinutes(Date date, int amount) {
        return add(date, Calendar.MINUTE, amount);
    }

    /**
     * 标准化输出
     *
     * @param date
     *            日期对象
     * @param format
     *            日期输出格式
     * @return 按照指定格式输出的字符串
     */
    public static String format(Date date, String format) {
        if (date == null) {
            return null;
        }

        return new SimpleDateFormat(format).format(date);
    }

    public static String formatNullToEmpty(Date date, String format) {
        if (date == null) {
            return "" ;
        }
        return format(date, format) ;
    }

    /**
     * 获得一个时间的年份数
     *
     * @param date
     * @return
     */
    public static int getYear(Date date) {
        if (date == null) {
            return -1;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.YEAR);
    }

    /**
     * 获得一个时间的月份数
     *
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        if (date == null) {
            return -1;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.MONTH) + 1;
    }

    /**
     * 获得一个时间在一个月中的天数
     *
     * @param date
     * @return
     */
    public static int getDayOfMonth(Date date) {
        if (date == null) {
            return -1;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 标准化输出
     *
     * @param s_date
     * @param format
     * @return
     */
    public static Date parse(String s_date, String format) {
        if (s_date == null)
            return null;
        try {
            return new SimpleDateFormat(format).parse(s_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 取得两个日期间隔秒数（日期1-日期2）
     *
     * @param one
     *            日期1
     * @param two
     *            日期2
     *
     * @return 间隔秒数
     */
    public static long getDiffSeconds(Date one, Date two) {
        Calendar sysDate = new GregorianCalendar();

        sysDate.setTime(one);

        Calendar failDate = new GregorianCalendar();

        failDate.setTime(two);
        return (sysDate.getTimeInMillis() - failDate.getTimeInMillis()) / 1000;
    }

    /**
     * 取得两个日期间隔分钟数（日期1-日期2）
     *
     * @param one
     * @param two
     * @return
     */
    public static long getDiffMinutes(Date one, Date two) {
        Calendar sysDate = new GregorianCalendar();

        sysDate.setTime(one);

        Calendar failDate = new GregorianCalendar();

        failDate.setTime(two);
        return (sysDate.getTimeInMillis() - failDate.getTimeInMillis())
                / (60 * 1000);
    }

    /**
     * 取得两个日期的间隔天数
     *
     * @param one
     * @param two
     *
     * @return 间隔天数
     */
    public static long getDiffDays(Date one, Date two) {
        if(one==null || two==null)
            return 0;
        Calendar sysDate = new GregorianCalendar();

        sysDate.setTime(one);

        Calendar failDate = new GregorianCalendar();

        failDate.setTime(two);
        return (sysDate.getTimeInMillis() - failDate.getTimeInMillis())
                / (24 * 60 * 60 * 1000);
    }

    /**
     * 判断是否是正确的日期格式
     *
     * @param str_date
     *            日期字符串
     * @param format
     *            日期格式
     * @return
     */
    public static boolean isValidDateFormat(String strDate, String format) {
        // 检查长度
        if (strDate.length() != longFormat.length()) {
            return false;
        }

        //检查格式是否正确
        DateFormat df = new SimpleDateFormat(format);
        df.setLenient(false);
        try {
            df.parse(strDate);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    /**
     * 获得当天的开始时间
     *
     * @return
     */
    public static Date today() {
        return parse(format(new Date(), webFormat), webFormat);
    }
    /**
     * 获取年龄大小
     * 两个string的格式都是“yyyy-MM-dd”
     * @param today
     * @param birthday
     * @return
     */
    public static int getAge(String today,String birthday){
        if(today!=null && birthday!=null && today.indexOf("-")>=0 && birthday.indexOf("-")>=0 ){
            String today_a[]=today.split("-");
            String birthday_a[]=birthday.split("-");
            int age=Integer.parseInt(today_a[0]) - Integer.parseInt(birthday_a[0]);
            if(today_a[1].compareTo(birthday_a[1])<0)
                age--;
            if(today_a[1].compareTo(birthday_a[1])==0 && today_a[2].compareTo(birthday_a[2])<0)
                age--;
            return age;
        }
        return 0;
    }

    /**
     * 时间格式，由"yyyy-MM-dd HH:mm:ss"变为"yyyy-MM-ddTHH:mm:ss"
     * @param time
     * @return
     */
    public static String getFormatTime(String time){
        if(time==null)
            return "";
        String timeArr[]=time.split(" ");
        return timeArr[0]+"T"+timeArr[1];
    }

    /**
     * 判断前一个日期是否比后一个日期晚或大
     * @param startDate
     * @param endDate
     * @return
     */
    public static boolean isLater(String startDate,String endDate){
        if(startDate==null || endDate==null)
            return false;
        if(startDate.compareTo(endDate)>0)
            return true;
        else
            return false;
    }

    /**
     * 取得年份（yyyy），例如2015
     * @return
     */
    public static String getYear(){
        return new SimpleDateFormat("yyyy").format(new Date()) ;
    }

    /**
     * 取得日期，包含年份（MMdd），例如0523（五月二十三号）
     * @return
     */
    public static String getMonthAndDay(){
        return new SimpleDateFormat("MMdd").format(new Date()) ;
    }

    public static Date getStartDate(){
        Calendar c = Calendar.getInstance();
        Date _today = new Date();

        c.setTime(_today);
        c.add(Calendar.DATE, 0);
        Date _start = c.getTime();

        String startDateStr = DateUtil.format(_start, DateUtil.webFormat);
        Date startDate=DateUtil.parse(startDateStr,DateUtil.webFormat);
        return  startDate;
    }

    public static Date getEndDate(){
        Calendar c = Calendar.getInstance();
        Date _today = new Date();

        c.setTime(_today);
        c.add(Calendar.DATE, 1);
        Date _end = c.getTime();

        String endDateStr = DateUtil.format(_end, DateUtil.webFormat);
        Date endDate=DateUtil.parse(endDateStr,DateUtil.webFormat);
        return endDate;
    }

    public static String getStartStr(){
        Calendar c = Calendar.getInstance();
        Date _today = new Date();

        String startDateStr = DateUtil.format(_today, DateUtil.webFormat);
        return startDateStr;
    }
}
