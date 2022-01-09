package com.xtl.base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 31925
 * Java日期时间
 */
public class JavaTime {
    public static void main(String[] args) throws InterruptedException {
        testDate();
        testDiff();
        testCalendar();
    }

    private static void testDate(){
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间是："+simpleDateFormat.format(date));
        System.out.printf("全部日期和时间信息：%tc%n",date);
        System.out.printf("年-月-日格式：%tF%n",date);
        System.out.printf("月/日/年格式：%tD%n",date);
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
        System.out.printf("HH:MM格式（24时制）：%tR",date);
    }

    private static void testDiff() throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println(new Date());
        Thread.sleep(5*60*2);
        System.out.println(new Date());
        long end = System.currentTimeMillis();
        long diff=end-start;
        System.out.println("测量的时间间隔（毫秒数）是："+diff);
    }

    /**
     * Calendar用于获取系统当前日期
     * Calender的月份是从0开始的，但日期和年份是从1开始的
     * */
    private static void testCalendar(){
        Calendar calendar=Calendar.getInstance();
        System.out.println("当前时间是："+calendar.getWeekYear()+"年"+(calendar.get(Calendar.MONTH)+1)+"月"+calendar.get(Calendar.DATE)+"日");
    }
}
