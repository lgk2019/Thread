package com.lgk.thread.producerAndConsumer;

/**
 * @author : lgk
 * @Description :
 * @ClassName : Producer
 * @date : 2020-8-8 0008
 **/
public class Producer implements Runnable {

    Queue queue;

    public Producer(Queue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            queue.set(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}