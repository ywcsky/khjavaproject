package com.kh.day09.upcasting;

public class UpcastingEx {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("일용자");
        // Student 객체 생성
        p = s; // 업캐스팅
        System.out.println(p.name);

        //다운캐스팅
        System.out.println(((Student)p).grade);
        System.out.println(((Student)p).department);


    }
}
