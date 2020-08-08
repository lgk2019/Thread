package com.lgk.thread;

class MyThread extends Thread{
    public void run(){
        System.out.println(getName() + "该线程正在执行......");
    }
}
/**
 * @author : lgk
 * @Description :
 * @ClassName : ThreadDemo
 * @date : 2020-8-7 0007
 **/
public class ThreadCreateDemo {
    /**
     * 在线程中，启动线程调用的是start()方法，然后会自动执行run()方法
     * 一个线程只能启动一次
     * 线程获取CPU的顺序是随机的
     **/
    public static void main(String[] args) {
        System.out.println("主线程1");
        //创建线程对象
        MyThread myThread = new MyThread();
        //启动线程
        myThread.start();
        System.out.println("主线程2");
    }
}
