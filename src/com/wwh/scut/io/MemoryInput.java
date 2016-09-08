package com.wwh.scut.io;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by Administrator on 2016/9/8.
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        String filePath="src" + File.separator + "com" + File.separator
                + "wwh" + File.separator + "scut" + File.separator + "io"+File.separator+"BufferedInputFile.java";
        StringReader in=new StringReader(BufferedInputFile.read(filePath));
        int c;
        while ((c=in.read())!=-1)
            System.out.println((char)c);
    }
}
