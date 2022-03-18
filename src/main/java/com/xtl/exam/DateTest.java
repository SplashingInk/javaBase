package com.xtl.exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName DateTest
 * @Description TODO
 * @Author xtl
 * @Date 2022/2/11 10:30
 */
public class DateTest {
    public static void main(String[] args) {
        String date="2022-02-11";
        Date realDate = convertStringToDate(date);
        System.out.println("Date形式的日期："+realDate);
        String stringDate= convertDateToString(realDate);
        System.out.println("String形式的日期："+stringDate);
        int allDaysOfMonth=getAllDateOfMonth(realDate);
        System.out.println(stringDate+"所在月份一共有"+allDaysOfMonth+"天");
        Scanner scanner=new Scanner(System.in);
        int day = scanner.nextInt();
        if(day>0){
            System.out.println("在"+stringDate+"的后"+Math.abs(day)+"天的日期是"+convertDateToString(subOrAddDate(realDate,day)));
        }else{
            System.out.println("在"+stringDate+"的前"+Math.abs(day)+"天的日期是"+convertDateToString(subOrAddDate(realDate,day)));
        }

    }

    /**
     *求一个日期的具体信息，比如所在月份有多少天，求其前后几天的日期
     */
    private static int getAllDateOfMonth(Date date){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        int min = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        int max  = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        Calendar c1=Calendar.getInstance();
        c1.set(Calendar.DAY_OF_MONTH,min);
        Calendar c2=Calendar.getInstance();
        c2.set(Calendar.DAY_OF_MONTH,max);
        Date first = c1.getTime();
        Date last = c2.getTime();
        return (int) ((last.getTime()-first.getTime())/(24*60*60*1000))+1;
    }
    /**
     *@descrition 字符串转换成日期
     * @param date 日期
     *@return 具体日期
     */
    private static Date convertStringToDate(String date) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date result=null;
        try{
            result=simpleDateFormat.parse(date);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     *@descrition 日期转换成字符串
     * @param date 日期
     *@return 字符串格式的日期
     */
    private static String convertDateToString(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }

    /**
     *@descrition 计算某天的前/后几天的日期
     * @param date 日期
     * @param day 需要加减的天数
     *@return  计算后的日期
     */
    private static Date subOrAddDate(Date date,int day){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,day);
        return calendar.getTime();
    }
}
