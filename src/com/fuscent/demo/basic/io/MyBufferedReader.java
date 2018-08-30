package com.fuscent.demo.basic.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class MyBufferedReader {
    private Reader r;
    private char[] chs = new char[1024]; //缓冲区
    private int position; //读取索引
    private int count; //判断是否读取到末尾
    public MyBufferedReader(Reader r){
        this.r = r;
    }
    public int myRead() throws IOException {
        if(count==0){
           count = r.read(chs);
           position = 0;
        }
        if(count<0){
            return -1;
        }
        count --;
        return chs[position++];
    }

    public void myClose() throws IOException {
        r.close();
    }

    public String myReadLine() throws IOException {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while((i=myRead())!=-1){
            if(i=='\r'){}
            else if(i=='\n')return builder.toString();
            else builder.append((char)i);
        }
        if(builder.length()>0){
            return builder.toString();
        }
        return null;
    }

//    @Override
//    public int read(char[] cbuf, int off, int len) throws IOException {
//        return 0;
//    }
//
////    @Override
//    public void close() throws IOException {
//        r.close();
//    }
}
