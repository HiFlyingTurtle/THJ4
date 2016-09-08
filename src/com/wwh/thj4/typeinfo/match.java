package com.wwh.thj4.typeinfo;

import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/4/24.
 */
public class match {
    private static Pattern p = Pattern.compile("\\w+\\.");
    public static void main(String args[]){
         String test="Test vo i d()";
        System.out.println( p.matcher(test).replaceAll(""));
    }
}
