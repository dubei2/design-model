package com.fuscent.demo.basic.file;

import org.junit.Test;

import java.io.File;
import java.util.Date;

public class FileDemo {

    @Test
    public void fun1(){
        File file = new File("E:/test/test.txt");
        long l = file.lastModified(); ////文件最后修改日期
        long length = file.length(); //文件字节数
        System.out.println(length);
        Date date = new Date(l);
        System.out.println(date);
    }
}
