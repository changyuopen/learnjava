package com.zhangyu.threaddemo;

/**
 * Created by changyuopen on 16/9/12.
 */
public class RunnableDemo01 {

    public static void main(String[] args) {
        MyThread04 my1 = new MyThread04("my1");
        MyThread04 my2 = new MyThread04("my2");
        Thread t1 = new Thread(my1);
        Thread t2 = new Thread(my2);

        t1.start();
        t2.start();
    }
}

class MyThread04 implements Runnable {
    private String name;
    public MyThread04(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " run, " + i);
        }
    }
}
