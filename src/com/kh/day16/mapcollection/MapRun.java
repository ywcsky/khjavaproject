package com.kh.day16.mapcollection;

import com.kh.day16.setcollection.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapRun {
    public static void main(String[] args) {
        Map<String, Student> stdMap = new HashMap<String, Student>();
        stdMap.put("1", new Student("손예진", 44, 66));
        stdMap.put("2", new Student("현빈", 55, 100));

        System.out.println("첫번째 학생 : " + stdMap.get("1").toString());
    }
        public void mapExample1 () {
            Scanner sc = new Scanner(System.in);
            Map<String, String> map = new HashMap<String, String>();
            map.put("02", "서울");
            map.put("031", "경기도");
            map.put("061", "전라도");
            map.put("053", "대구");
            System.out.println("저장된 데이터의 수 : " + map.size());
            System.out.println("02누르면 서울이 나옵니다. : " + map.get("02"));
            System.out.println("031을 누르면 경기도가 나옵니다 : " + map.get("031"));
            System.out.print("지역번호 입력 : ");
            String regionCode = sc.next();

            System.out.println("입력하신 지역번호에 대한 지역은 : " + map.get(regionCode));
        }

        public void mapExample2 () {
            Map<String, Object> objMap = new HashMap<String, Object>();
            objMap.put("name", "핫팩");
            objMap.put("price", 1500);
            objMap.put("isGood", true);
            System.out.println("상품 이름은 " + objMap.get("name"));
            System.out.println("가격은 " + objMap.get("price") + "원");
            String result = (boolean) objMap.get("isGood") ? "추천" : "비추천";
            System.out.println("추천여부 " + result);
        }
    }