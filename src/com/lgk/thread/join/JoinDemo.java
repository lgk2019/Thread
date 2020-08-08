package com.lgk.thread.join;

/**
 * @author : lgk
 * @Description :等待调用该方法的线程执行结束后其他线程才执行
 * @ClassName : JoinDemo
 * @date : 2020-8-7 0007
 **/
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        //Thread t = new Thread(mt);
        mt.start();
        mt.join();
        for (int i = 1; i <= 15; i++){
            System.out.println("主线程执行第"+i+"次");
        }
        System.out.println("主线程运行结束！");
        //mt.join();
    }
}
class MyThread extends Thread{
    /**
     * @author : lgk
     * @Description : TODO
     * @date : 2020-8-7 0007
     * @param : []
     * @return : void
     **/
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++){
            System.out.println(getName()+"正在执行"+i+"次");
        }
        //System.out.println(Thread.currentThread().getName()+"正在执行");
    }
}