package com.CTDW.baseio.withbuffer;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;

//使用程序缓区 读写
public class BufIo {
    public static void main(String[] args) throws Exception {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("test.txt"));
        //使用write的时候写入应用程序缓冲区 ，不调用操作系统
        bufferedOutputStream.write("sdf".getBytes());
        //使用flush才调用操作系统
        bufferedOutputStream.flush();
    }
}
