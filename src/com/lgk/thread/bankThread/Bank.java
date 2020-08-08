package com.lgk.thread.bankThread;

/**
 * @author : lgk
 * @Description :
 * @ClassName : Bank
 * @date : 2020-8-8 0008
 **/
public class Bank {
    //账号
    private String account;
    //账户余额
    private int balance;

    public Bank() {
    }

    public Bank(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{账号：" + account + ",余额：" + balance + "}";
    }

    /**
     * @author : lgk
     * @Description : 存款
     * @date : 2020-8-8
     **/
    /**
     * 在成员方法使用synchronized的方式
     **/
    public synchronized void saveAccount(){
        //获取当前账户余额
        int balance = getBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //修改账户余额,存100元
        balance += 100;
        //修改账户余额
        setBalance(balance);
        //输出存款后的账户余额
        System.out.println("存款后的账户余额为："+balance);
    }
    /**
     * @author : lgk
     * @Description : 取款
     * @date : 2020-8-8
     **/
    public void drawAccount() {
        /**
         * 使用代码块的方式
         **/
        synchronized (this) {
            //获取当前账户余额
            int balance = getBalance();
            //修改余额。取200
            balance -= 200;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //修改账户余额
            setBalance(balance);
            //显示取款后的账户余额
            System.out.println("取款后的账户余额：" + balance);
        }
    }
}