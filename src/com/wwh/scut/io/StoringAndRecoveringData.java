package com.wwh.scut.io;

import java.io.*;

/**
 * Created by Administrator on 2016/9/8.
 */
public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException {
        //写入数据
        DataOutputStream outputStream=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("test.txt")));
        outputStream.writeDouble(3.1415926);
        outputStream.writeUTF("你好");
        outputStream.writeInt(100);
        outputStream.close();
        //读取数据
        DataInputStream inputStream=new DataInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
        System.out.println(inputStream.readDouble());
        System.out.println(inputStream.readUTF());
        System.out.println(inputStream.readInt());
    }
}
