package com.lgk.thread.priority;

/**
 * @author : lgk
 * @Description :
 * @ClassName : PriorityDemo
 * @date : 2020-8-8 0008
 **/
public class PriorityDemo {
    public static void main(String[] args) {
        int mainPriority = Thread.currentThread().getPriority();
        //System.out.println("主线程的优先级为："+mainPriority);
        MyThread myThread1 = new MyThread("线程1");
        MyThread myThread2 = new MyThread("线程2");
        //myThread1.setPriority(10);
        myThread1.setPriority(Thread.MAX_PRIORITY);
        myThread2.setPriority(1);

        myThread1.start();
        myThread2.start();

        //System.out.println("线程1的优先级为："+myThread1.getPriority());
        //System.out.println("线程2的优先级为："+myThread2.getPriority());
    }
}
class MyThread extends Thread{

    private String name;
    public MyThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            System.out.println(name+"正在运行"+i);
        }
        //System.out.println(Thread.currentThread().getName()+"正在执行");
    }
}