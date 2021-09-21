package com.CTDW.baseio.withbuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Biotest {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9090, 20);
        System.out.println("new serverSocket(9090)");

        while (true){

            Socket accept = serverSocket.accept();
            System.out.println("客户端的地址"+accept.getInetAddress()+":"+accept.getPort());
            new Thread(()->{
                InputStream  in = null;
                try {
                    in = accept.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
                    while (true){
                        String s = bufferedReader.readLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
