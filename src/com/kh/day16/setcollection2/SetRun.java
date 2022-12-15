package com.kh.day16.setcollection2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRun {
    public static void main(String[] args) {
        // Collection의 List, Set, Map 저장소의 역할을 한다.
        // 임시 또는 영구적으로 저장함
        // 자료구조의 특성에 따라서 List, Set, Map 을 선택하여 쓸 수 있음.


//        set.add("one"); // Set Collection 에서는 중복을 허용하지 않음

        System.out.println("========================");


//        Set<Integer> set2 = new HashSet<Integer>();
//        set2.add(1);
//        set2.add(22);
        Set<Student> set3 = new HashSet<Student>();
        Student kdw = new Student("강동원" , 35, 100);
        set3.add(kdw);
        System.out.println("데이터 크기 : "+ set3.size());
        set3.add(kdw);
        System.out.println("데이터 크기 : " + set3.size());
        set3.add(kdw);
        System.out.println("데이터 크기 : " + set3.size());

        System.out.println(kdw.toString());

//        System.out.println(new Student("송혜교", 100, 100).hashCode());
//        System.out.println(new Student("송혜교", 100, 100).hashCode());
//        System.out.println(new Student("송혜교", 100, 100).hashCode());

    }

    public void setExample(){
        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        System.out.println("저장된 데이터의 수 : " + set.size());
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void set2Example(){
        Set<String> set = new HashSet<String>();
        Iterator<String> iterator2 = set.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
