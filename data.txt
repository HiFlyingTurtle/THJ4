package com.wwh.scut.io;

import java.io.*;

/**
 * Created by Administrator on 2016/8/31.
 */
public class FileIOStream {
   private static final String thisFilePath = "src" + File.separator + "com" + File.separator
            + "wwh" + File.separator + "scut" + File.separator + "io"+File.separator+"FileIOStream.java";
    public  static void main(String args[]) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(thisFilePath);
        FileOutputStream fileOutputStream=new FileOutputStream("data.txt");

        byte[] inOutBytes=new byte[fileInputStream.available()];
        fileInputStream.read(inOutBytes);
        fileOutputStream.write(inOutBytes);
        fileOutputStream.close();;
        fileInputStream.close();
    }
}
