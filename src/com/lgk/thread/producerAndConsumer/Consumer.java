package com.lgk.thread.producerAndConsumer;

/**
 * @author : lgk
 * @Description :
 * @ClassName : Consumer
 * @date : 2020-8-8 0008
 **/
public class Consumer implements Runnable {

    Queue queue;

    public Consumer(Queue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            queue.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}