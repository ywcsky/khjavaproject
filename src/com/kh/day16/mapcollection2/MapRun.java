package com.kh.day16.mapcollection2;

import java.util.HashMap;
import java.util.Map;

public class MapRun {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("02", "서울");
        map.put("031", "경기도");
        map.put("061", "전라도");
        map.put("053", "대구");

        System.out.println("02를 누르면 서울" + map.get("02"));
    }
}
