package com.zhangyu.threaddemo;

/**
 * Created by changyuopen on 16/9/12.
 */
public class RunnableDemo02 {
    public static void main(String[] args) {
        MyThread05 my = new MyThread05();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
    }
}

class MyThread05 implements Runnable {
    private int ticket = 5;
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (ticket > 0) {
                System.out.println("ticket = " + ticket--);
            }
        }
    }
}
