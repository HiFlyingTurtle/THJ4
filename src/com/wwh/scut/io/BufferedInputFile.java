package com.wwh.scut.io;

import java.io.*;

/**
 * Created by Administrator on 2016/8/31.
 */
public class BufferedInputFile {

    public static  String read(String fileName) throws IOException {
        BufferedReader in=new BufferedReader((new FileReader(fileName)));
        String s;
        StringBuilder sb=new StringBuilder();
        //不考虑线程安全StringBulider 比StringBuffer效率高
        while((s=in.readLine())!=null){
            sb.append(s+"\n");

        }
        //关闭文件
        in.close();
        return sb.toString();
    }
    public static void ChangeSystemOut(){
        PrintWriter out=new PrintWriter(System.out,true);
        out.println("Hello PrintWriter");
        out.close();
    }
    public static void  main (String args[]) throws IOException {
        /*
      System.out.println("Test:"+"\n"+read("src"+ File.separator+"com"+File.separator
      +"wwh"+File.separator+"scut"+File.separator+"io"+File.separator+"BufferedInputFile.java"));
        */
        //ChangeSystemOut();
        // System.out.println("xixi"+File.separator);
    }

}
