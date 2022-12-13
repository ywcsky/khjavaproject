package com.kh.day14.listcollection;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Run {
    public static void main(String[] args) {
    ObjectList objList = new ObjectList();
    objList.add(11);
    objList.add("월");
//    objList.add(23);
//    objList.add("일");
        objList.add(new Student());
        int num = (int) objList.get(0);
        String str = (String)objList.get(1);
        Student sOne = (Student) objList.get(2);

        // 다양한 자료형을 사용할수 있으며 꺼내쓸때는 다운캐스팅 해야한다.
    }

    public void intExample() {
//        int[] nums = new int[3];
        intList nums = new intList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println("1번째 값 : " + nums.get(0));
        System.out.println("2번째 값 : " + nums.get(1));
        System.out.println("3번째 값 : " + nums.get(2));
        System.out.println("크기 : " + nums.size());
        nums.clear();
        System.out.println("삭제 후 크기 : " + nums.size());
    }
}
