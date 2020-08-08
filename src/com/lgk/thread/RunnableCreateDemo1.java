package com.lgk.thread;

/**
 * @author : lgk
 * @Description :
 * @ClassName : RunnableCreateDemo1
 * @date : 2020-8-7 0007
 **/
public class RunnableCreateDemo1 {
    public static void main(String[] args) {
        printRunnable pr = new printRunnable();
        Thread t = new Thread(pr);
        t.start();
        printRunnable pr1 = new printRunnable();
        Thread t1 = new Thread(pr1);
        t1.start();
    }
}
class printRunnable implements Runnable{

    @Override
    public void run() {
        int i = 1;
        while (i <= 10)
        System.out.println(Thread.currentThread().getName()+"正在执行......"+ i++);
    }
}