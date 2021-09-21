package com.CTDW.baseio.nobuffer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//无buffer io 读写
public class FileIO {
    public static void main(String[] args) throws IOException {
//        FileWriter fileWriter = new FileWriter("test.txt");
//        //io默认使用flush方法通知操作系统调用将数据存入操作系统的缓冲区
//        //普通io使用write写入时默认调用flush，没写一次都调用一次操作系统 操作频繁耗时
//        for (int i =0;i<=9;i++){
//            fileWriter.write("asdee\n");
//        }
//        //通知操作系统将缓冲区数据写入磁盘，如果不实用flush 缓冲区数据满后会自动推入磁盘
//        fileWriter.close();

        FileReader fileReader = new FileReader("test.txt");
        char[] b = new char[1024];
        while (fileReader.read(b)!= -1){
            System.out.println(b.length);
        }
        System.out.println(new String(b));
}
}
