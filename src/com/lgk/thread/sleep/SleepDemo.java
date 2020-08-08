package com.lgk.thread.sleep;

/**
 * @author : lgk
 * @Description :sleep方法的介绍，应用场景：定时刷新，时钟，由于线程的随机性，会导致定时或时钟不那么准确
 * @ClassName : SleepDemo
 * @date : 2020-8-7 0007
 **/
public class SleepDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
        Thread t1 = new Thread(mt);
        t1.start();
    }
}
class MyThread implements Runnable{
    /**
     * @author : lgk
     * @Description : TODO
     * @date : 2020-8-7 0007
     * @param : []
     * @return : void
     **/
    @Override
    public void run() {
        for (int i = 1;i <= 30; i++){
            System.out.println(Thread.currentThread().getName()+"执行第"+i+"次");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}