package com.zhangyu.threaddemo;

/**
 * Created by changyuopen on 16/9/12.
 */

class MyThread06 implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(
                    Thread.currentThread().getName() + " run, i = " + i
            );
        }
    }
}

public class ThreadNameDemo {
    public static void main(String[] args) {
        MyThread06 my = new MyThread06();
        new Thread(my).start();
        new Thread(my, "line - A").start();
        new Thread(my, "line - B").start();
        new Thread(my).start();
        new Thread(my).start();
    }
}
