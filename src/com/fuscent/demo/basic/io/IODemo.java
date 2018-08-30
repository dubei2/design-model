package com.fuscent.demo.basic.io;

import org.junit.Test;

import java.io.*;
import java.util.Date;

public class IODemo {
    @Test
    public void fun1() throws IOException {
        //创建带有行号的Reader，
        LineNumberReader lnr = new LineNumberReader(new FileReader("E:/test/test.txt"));
        //设置第一行对应的行号，并非从行号所在行开始读取
        lnr.setLineNumber(2);
        String line;
        while((line=lnr.readLine())!=null){
            System.out.println(lnr.getLineNumber()+"=="+line);
            //3==hello
            //4==world
            //5==java
            //6==mimi
        }
    }

    @Test
    public void fun2() throws IOException {
        FileInputStream fis = new FileInputStream("E:/test/test.txt");
        FileOutputStream fos = new FileOutputStream("E:/test/out/test.txt");
        int available = fis.available(); //文件字节数
        System.out.println(available);
        int ch = 0;
        int count = 0;
        //按字节读取，字母单字节，汉子3字节，换行符也占用字节
        while((ch=fis.read())!=-1){
            fos.write(ch);
            count++;
            System.out.println(ch);
        }
        System.out.println(count);
        System.out.println((int)'\r'); //13
        System.out.println((int)'\n'); //10
    }

    @Test
    public void fun3() throws IOException {
        FileReader fr = new FileReader("E:/test/test.txt");
        int ch = 0;
        while((ch = fr.read())!=-1){
            System.out.println(ch); //杜贝 对应 26460 36125
        }
    }

    @Test
    public void fun4() throws IOException {
        MyBufferedReader mbr = new MyBufferedReader(new FileReader("E:/test/test.txt"));
//        int ch = 0;
//        while((ch=mbr.myRead())!=-1){
//            System.out.println(ch);
//        }
        String line = null;
        while((line=mbr.myReadLine())!=null){
            System.out.println(line);
        }
        mbr.myClose();
    }
}
