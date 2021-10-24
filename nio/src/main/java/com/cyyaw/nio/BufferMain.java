package com.cyyaw.nio;


import java.nio.IntBuffer;

/**
 *
 *  Buffer 的使用
 *
 */
public class BufferMain {

    public static void main(String[] args) {

        //  创建一个buffer , 大小为5， 可以存放5个int
        IntBuffer intBuffer = IntBuffer.allocate(5);

        // 存放数据
        for (int i = 0; i < intBuffer.capacity(); i++) {
            intBuffer.put(i*2);
        }

        // 将buffer 转换，读写切换
        IntBuffer flip = intBuffer.flip();

        while (intBuffer.hasRemaining()){
            System.out.println(intBuffer.get());
        }


    }

}
