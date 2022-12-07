package com.kh.day11.exercise;

import com.kh.day10.abstractex.Shape;

public class Exercise_Wrapper {
    public void parserExample(){
        String strNum = "221123";
        String strNum2 = "230502";
        int i = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
        System.out.println(i);
    }

    public void dataParsingExample(){
     String strData = "13";
     String strData2 = "23.502";
     String strData3 = "SPRING";
     byte strDataByte = Byte.parseByte(strData);
     short strDataShort = Short.parseShort(strData);
     long strDataLong = Long.parseLong(strData);

     float strData2Float = Float.parseFloat(strData2);
     double strData2Double = Double.parseDouble(strData2);

     char strData3Char = strData3.charAt(0);
    }

}
