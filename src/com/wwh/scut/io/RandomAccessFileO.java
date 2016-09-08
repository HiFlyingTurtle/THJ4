package com.wwh.scut.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2016/9/8.
 */
public class RandomAccessFileO {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file=new RandomAccessFile("src//data.txt","rw");
        file.seek(6);

        System.out.println(file.getFilePointer());

        System.out.println((char)file.read());

        file.write("Hello,World".getBytes());

        file.seek(0);

        System.out.println(file.readLine());

        file.close();
    }
}
