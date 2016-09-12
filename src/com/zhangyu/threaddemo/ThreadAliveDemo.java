package com.zhangyu.threaddemo;

/**
 * Created by changyuopen on 16/9/12.
 */

class MyThread07 implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(
                    Thread.currentThread().getName() +
                            " run -- " + i
            );
        }
    }
}

public class ThreadAliveDemo {
    public static void main(String[] args) {
        MyThread07 my = new MyThread07();
        Thread t = new Thread(my, "line");
        System.out.println("line run -->" + t.isAlive());

        t.start();
        System.out.println("line run -->" + t.isAlive());

        for(int i = 0; i < 3; i++) {
            System.out.println(" main run -->" + i);
        }


        System.out.println("line run -->" + t.isAlive());
    }
}
