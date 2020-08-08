package com.lgk.thread;
class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }
    public void run(){
        for (int i = 1;i < 10;i++){
            System.out.println(getName() + "正在执行" + i);
        }
    }
}
/**
 * @author : lgk
 * @Description :
 * @ClassName : ThreadCreateDemo2
 * @date : 2020-8-7 0007
 **/
public class ThreadCreateDemo2 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1("线程1");
        MyThread1 mt2 = new MyThread1("线程2");
        mt1.start();
        mt2.start();
    }
}