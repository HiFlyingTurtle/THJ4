package com.wwh.scut.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by Administrator on 2016/9/8.
 */
public class TextFile extends ArrayList<String> {
    //读取文件的内容返回字符串
    public static  String read(String fileName){
        StringBuilder sb=new StringBuilder();
        try{
            //创建缓冲字符流
          BufferedReader in=new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()));
                  try{
                      String s;
                      //读取一个文本行
                      while ((s=in.readLine())!=null){
                             sb.append(s);
                             sb.append("\n");
                      }
                  } finally {
                      in.close();

                  }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static  void write(String fileName,String text){

            try (PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile())) {
              try{
                  out.write(text);
              }finally {
                  out.close();
              }

            } catch (IOException e) {
                e.printStackTrace();
            }
    }
   //通过正则匹配，读取文件
    public  TextFile(String fileName,String filter){
        super(Arrays.asList(read(fileName).split(filter)));
        //移除一个空格位置
        if(get(0).equals("")) remove(0);
    }

    public  TextFile(String fileName){
        this(fileName,"\n");
    }
  //写一个文本文件
    public void write(String fileName){
        try{
            PrintWriter out=new PrintWriter(new File(fileName).getAbsoluteFile());
            try{
                for(String item:this){
                    out.write(item+"\n");
                }
            }finally {
                out.close();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        //读取文件
        String file=read("src/com/wwh/scut/io/TextFile.java");
        //写到文件
        write("tf.txt",file);
        TextFile text=new TextFile("tf.txt");
        text.write("tf1.txt");

        TreeSet<String> words=new TreeSet<>(new TextFile("src/com/wwh/scut/io/TextFile.java","\\W+"));
        System.out.println(words.headSet("a"));
    }
}
