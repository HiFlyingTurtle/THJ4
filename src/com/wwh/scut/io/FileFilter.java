package com.wwh.scut.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Administrator on 2016/8/31.
 */
public class FileFilter {
    public static void main(String[] args) {
        String dir = "src" + File.separator + "com" + File.separator
                + "wwh" + File.separator + "scut" + File.separator + "io";
        File file=new File(dir);
        MyFilter filter=new MyFilter("y.java");
        String files[]=file.list();

        for(String name:files){
            System.out.println(name);
        }

    }
    /**
     * 内部类实现过滤器的文件接口
     */
    static class MyFilter implements FilenameFilter{
        private String type;
        public MyFilter(String type){
            this.type=type;
        }
        @Override
        public boolean accept(File dir, String name) {
            return name.endsWith(type);
        }
    }


}
