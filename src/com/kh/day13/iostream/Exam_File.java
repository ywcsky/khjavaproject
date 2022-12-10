package com.kh.day13.iostream;

import java.io.File;
import java.io.IOException;

public class Exam_File {
    public static void main(String[] args) {
        File f = new File("E://Temp//img_minion.png");
        String fileName = f.getName();
        String path = f.getPath();
        String parent = f.getParent();

        System.out.println("파일 이름 : " + fileName);
        System.out.println("파일 경로 : " + path);
        System.out.println("부모 폴더 : " + parent);

        try {
        File fileMake = new File("src/iostream/fileOne.txt");
//        fileMake.createNewFile();
        File folderMake = new File("src/file");
//        folderMake.mkdir();
        File fileMake2 = new File("src/file/file.txt");
        fileMake2.createNewFile();
            System.out.println("파일이 존재하는가? : " + fileMake.exists());
            System.out.println("fileOne.txt가 파일이 맞는가 ? : " + fileMake.isFile());
            System.out.println("file폴더가 폴더가 맞는가 ? : " + folderMake.isDirectory());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
