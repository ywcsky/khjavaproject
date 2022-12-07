package com.kh.day11.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
    public void exercise1(){
        String str = "홍길동/장화/홍련/콩쥐/팥쥐";
        StringTokenizer st = new StringTokenizer(str,"/");
        while(st.hasMoreTokens()){
            if(st.nextToken().equals("홍련")){
                System.out.println("홍련");
            }
        }
    }
}
