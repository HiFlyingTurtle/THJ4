package com.wwh.scut.io;

import java.io.*;

/**
 * Created by Administrator on 2016/8/31.
 */
public class CopyFile {
    public static void main(String args[]) throws IOException {
        String dir = "src" + File.separator + "com" + File.separator
                + "wwh" + File.separator + "scut" + File.separator + "io";
        copyFile(dir+File.separator+"CopyFile.java","G://copy.java");
        System.out.println("success!");
    }

    public static void copyFile(String srcFile, String destFile) throws IOException {
        copyFile(new File(srcFile), new File(destFile));
    }

    public static void copyFile(File srcFile, File destFile) throws IOException {
        if (!srcFile.exists()) {
            throw new IllegalArgumentException("文件" + srcFile + "不存在");
        }
        if (!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile+"不是文件");

        }
        FileInputStream in=new FileInputStream(srcFile);
        FileOutputStream out=new FileOutputStream(destFile);

        byte[] bytes=new byte[2*1024];
        int b;
        while((b=in.read(bytes,0,bytes.length))!=-1){
            out.write(bytes,0,b);

            out.flush();

        }
        out.close();
        in.close();
    }

}
