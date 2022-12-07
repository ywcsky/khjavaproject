package com.kh.day11.javaapi;

import java.util.Calendar;
import java.util.TimeZone;

public class Exam_Calendar {
    public static void main(String[] args) {
        Exam_Calendar ec = new Exam_Calendar();
//        ec.printCalendar(new Calendar());
        Calendar today = Calendar.getInstance();
        ec.printCalendar("현재", today);
        System.out.println();
        Calendar someDate = Calendar.getInstance();
        someDate.clear();
        someDate.set(2022,10, 23);
        someDate.set(Calendar.HOUR_OF_DAY, 9);
        someDate.set(Calendar.MINUTE, 0);
        ec.printCalendar("개강일",someDate);

        System.out.println();

        Calendar endDate = Calendar.getInstance();
        endDate.set(2023, 4,2);
        endDate.set(Calendar.HOUR_OF_DAY,17);
        endDate.set(Calendar.MINUTE,50);
        ec.printCalendar("종강일",endDate);
    }

    public void printCalendar(String a, Calendar cal) {
//        Calendar today = cal.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int hourOFday = cal.get(Calendar.HOUR_OF_DAY);
        String dayofweek = "";
        switch (dayOfWeek){
            case Calendar.SUNDAY :
                dayofweek = "일요일";
                break;
            case Calendar.MONDAY :
                dayofweek = "월요일";
                break;
            case Calendar.TUESDAY :
                dayofweek = "화요일";
                break;
            case Calendar.WEDNESDAY :
                dayofweek = "수요일";
                break;
            case Calendar.THURSDAY :
                dayofweek = "목요일";
                break;
            case Calendar.FRIDAY :
                dayofweek = "금요일";
                break;
            case Calendar.SATURDAY :
                dayofweek = "토요일";
                break;
        }
        int hour = cal.get(Calendar.HOUR);
        int ampm = cal.get(Calendar.AM_PM);
        String amPm = "";
        switch (ampm){
            case Calendar.AM :
                amPm = "AM";
                break;
            case Calendar.PM:
                amPm = "PM";
                break;
        }
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int mil = cal.get(Calendar.MILLISECOND);
       // 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초
        System.out.printf( a+" %d/%d/%d/%s(%d시) %s %d시 %d분 %d초 %d밀리초",year,month,day, dayofweek,hourOFday,amPm,hour,minute,second,mil);
    }
}
