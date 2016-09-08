package com.wwh.scut.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by Administrator on 2016/9/8.
 */
public class PipeStream {
    public static void main(String[] args) throws IOException {
        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream input=new PipedInputStream(output);

        Thread outputThread=new Thread(new Runnable() {
            @Override
            public void run() {
           try {
                 output.write("Hello,PipedStream".getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
            }
        });

        Thread inputThread=new Thread(new Runnable() {
            @Override
            public void run() {
              try{
                  int data=input.read();
                  while(data!=-1){
                      System.out.print((char)data);
                      data=input.read();
                  }
              } catch (IOException e) {
                  e.printStackTrace();
              }
            }
        });
        outputThread.start();
        inputThread.start();

    }
}
