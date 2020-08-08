package com.lgk.thread.producerAndConsumer;

/**
 * @author : lgk
 * @Description :
 * @ClassName : App
 * @date : 2020-8-8 0008
 **/
public class App {
    public static void main(String[] args) {
        Queue queue = new Queue();
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}