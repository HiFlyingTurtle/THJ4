package com.wwh.scut.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2016/8/31.
 */
public class FileO {
    public static void main(String[] args) {
        try {
          File dir=new File("G:"+File.separator+"dir");
            dir.mkdir();
            File file=new File(dir,"file.txt");
            file.createNewFile();
            System.out.println(dir.isDirectory());
            if(file.delete()){
                System.out.println(file.getName()+"被删除了");

            }else{
                System.out.println("文件删除失败！");
            }
        }catch (IOException e){
             e.printStackTrace();
        }

    }
}
