package com.CTDW.baseio.nobuffer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

//在内存中操作io
public class memeryIo {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        //将1k大小输出流写入到内存中
        byteArrayOutputStream.write("hello".getBytes());

        byte[] b = new byte[1024];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
        byte[] data = new byte[1024];
        int read = byteArrayInputStream.read(data);
        System.out.println(new String(data));
    }
}
