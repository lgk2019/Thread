package com.lgk.thread.bankThread;

/**
 * @author : lgk
 * @Description :存款
 * @ClassName : SaveAccount
 * @date : 2020-8-8 0008
 **/
public class SaveAccount implements Runnable{
    Bank bank;
    public SaveAccount(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run(){
        bank.saveAccount();
    }
}