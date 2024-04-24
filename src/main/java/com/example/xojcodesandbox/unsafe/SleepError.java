package com.example.xojcodesandbox.unsafe;

/**
 * @author xq
 * @create 2024/4/5 20:35
 */

/**
 * 无限睡眠（阻塞程序执行）
 * @author 29923
 */
public class SleepError {

    public static void main(String[] args) throws InterruptedException {
        long ONE_HOUR = 60 * 60 * 1000L;
        Thread.sleep(ONE_HOUR);
        System.out.println("睡完了");
    }
}

