package com.CTDW.baseio.withbuffer;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class RandomAccessFileTest {
    public static void main(String[] args) throws Exception{
        RandomAccessFile rw = new RandomAccessFile(new File("text.txt"), "rw");
        //开辟一个内核和堆外共享缓存区
        MappedByteBuffer map = rw.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, 1024);
        //map.put();
        //开辟一个堆内buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        rw.getChannel().write(byteBuffer);
        //开辟一个堆外buffer
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(1024);
        rw.getChannel().write(byteBuffer1);


    }
}
