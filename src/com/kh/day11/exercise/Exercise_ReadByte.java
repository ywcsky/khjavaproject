package com.kh.day11.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exercise_ReadByte {
    public static void main(String[] args) {


        InputStream is;
        String str = "";
        {
            try {
                is = new FileInputStream("src/iostream/inputStream.txt");
                int byteNo;
                byte[] bytes = new byte[3];

                while (true) {
                    byteNo = is.read(bytes);
                    if (byteNo == -1) break;
                    str += new String(bytes, 0 , byteNo);
                    str += " ";
                }
                System.out.println(str);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
