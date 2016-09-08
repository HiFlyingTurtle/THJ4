package com.wwh.scut.io;

import java.io.File;

/**
 * Created by Administrator on 2016/8/31.
 */
public class FileMethod {
    public static  void fileData(File f){
        System.out.println("绝对路径:"+f.getAbsolutePath()+
    "\n可读:"+f.canRead()+
        "\n可写:"+f.canWrite()+
        "\n文件名:"+f.getName()+
        "\n上级目录:"+f.getParent()+
        "\n 相对地址:"+f.getPath()+
        "\n 长度:"+f.length()+
        "\n 最近修改时间:"+f.lastModified());
    if (f.isFile())
           System.out.println("是一个文件");
        else if (f.isDirectory())
        System.out.println("是一个目录");
    }
   public static void main(String args[]){
       File file=new File("src");
       fileData(file);   }
}
