package com.kh.day10.wrapperex;

public class Exam_Wrapper {
    public static void main(String[] args){
        // Wrapper 객체로 부터 기본 타입 값 알아내기
        Integer i = Integer.valueOf(1123);
        // 객체를 만들어서 사용하다가
        int e = i.intValue();
        // 기본형으로 변환 가능
        Integer f = null;
//        int m = null;
        Character c = Character.valueOf('c');
        char che = c.charValue();

        Double d = Double.valueOf(1.30);
        double db = d.doubleValue();

        // 문자열을 기본 데이터 타입(int, boolean, double) 으로 변환
        // type mismatch
        int num = Integer.parseInt("123");
        int result = num + 1;
        System.out.println("변환된 값 : " + result);
        boolean isYn = Boolean.parseBoolean("true");
        System.out.println("변환된 값 : " + isYn);
        double fNum = Double.parseDouble("3.14");
        System.out.println("변환된 값 : " + fNum);

        // 기본 데이터 타입(int, double, char)
        // 문자열로 변환
        String data1 = Integer.toString(123);
        System.out.println(data1);
        String data2 = Integer.toHexString(123);
        String data3 = Double.toHexString(3.14);
        String data4 = Character.toString('a');
        String data5 = Boolean.toString(true);

    }
}
