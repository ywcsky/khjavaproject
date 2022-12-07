package com.kh.day11.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Exam_Date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");

        String transDate1 = trans.format(date);
        System.out.println(transDate1);

        String transDate2 = trans2.format(date);
        System.out.println(transDate2);

        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());
        String changed = trans2.format(calendar.getTime());
        System.out.println(changed);

        StringTokenizer st = new StringTokenizer(changed);
        String change2 = changed.substring(0,10);
        System.out.println(change2);






    }
}
