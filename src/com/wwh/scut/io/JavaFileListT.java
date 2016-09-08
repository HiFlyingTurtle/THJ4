package com.wwh.scut.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Administrator on 2016/9/8.
 */
public class JavaFileListT {
    public static FilenameFilter javaFileFilter(final String type){
        return new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(name).getName().indexOf(type)!=-1;
            }
        };
    }

    public static void main(String[] args) {
        File file=new File("src//com//wwh//scut//io");
        String [] fileNames=file.list(javaFileFilter(".java"));
        for (String item:fileNames){
            System.out.println(item);
        }
    }
}
