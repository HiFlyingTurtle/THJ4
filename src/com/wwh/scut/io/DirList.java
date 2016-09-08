package com.wwh.scut.io;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/8/31.
 */
public class DirList {
    public static  void main(String args[]){
        File path=new File(".");
        String list[]=path.list();

        Arrays.asList(list,String.CASE_INSENSITIVE_ORDER);
        for (String dirItem:list){
            System.out.println(dirItem);
        }


    }
}
