package com.zhangyu.threaddemo;

/**
 * Created by changyuopen on 16/9/12.
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        MyThread03 thread = new MyThread03("mythread");
        thread.start();
        thread.start();
    }
}

class MyThread03 extends Thread {
    private String threadName;

    public MyThread03(String name) {
        this.threadName = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.threadName + " run ," + i);
        }
    }
}
