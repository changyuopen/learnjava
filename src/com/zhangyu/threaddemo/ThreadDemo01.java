package com.zhangyu.threaddemo;

/**
 * Created by changyuopen on 16/9/4.
 */
class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.name + " run " + (i + 1));
        }
    }
}

public class ThreadDemo01 {
    public static void exec() {
        MyThread thread1 = new MyThread("Thread A");
        MyThread thread2 = new MyThread("Thread B");

        thread1.run();
        thread2.run();
    }
}
