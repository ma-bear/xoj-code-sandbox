package com.example.xojcodesandbox.unsafe;

/**
 * @author xq
 * @create 2024/4/5 20:32
 */


import java.util.ArrayList;
import java.util.List;

/**
 * 无限占用空间（浪费系统内存）
 * @author 29923
 */
public class MemoryError {

    public static void main(String[] args) throws InterruptedException {
        List<byte[]> bytes = new ArrayList<>();
        while (true) {
            bytes.add(new byte[10000]);
        }
    }
}
