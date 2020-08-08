package com.lgk.thread.bankThread;

/**
 * @author : lgk
 * @Description :取款
 * @ClassName : DrawAccount
 * @date : 2020-8-8 0008
 **/
public class DrawAccount implements Runnable{
    Bank bank;
    public DrawAccount(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.drawAccount();
    }
}