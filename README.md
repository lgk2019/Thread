1、什么是线程？
    * 程序：程序是一组指令的有序集合，它本身没有任何运行的含义，它只是一个静态的实体。
    * 进程：是指可执行程序存放在计算机存储器的一个指令序列，它是一个动态执行的过程。
    * 线程：线程是比进程还要小的运行单位，一个进程包含多个线程。
    
2、线程的创建
    * 创建一个Thread类，或者一个Thread子类的对象
    * 创建一个实现Runnable接口的类的对象
    * Thread是一个线程类，位于java.lang包下
        * 构造方法
            * Thread() -- 创建一个线程对象
            * Thread(String name) -- 创建一个具有指定名称的线程对象
            * Thread(Runnable target) -- 创建一个基于Runnable接口实现类的线程对象
            * Thread(Runnable target, String name) -- 创建一个基于Runnable接口实现类，并具有指定名称的线程对象
        * Thread类的常用方法(Thread是extends Object，并且implements Runnable接口的)
            * void run() -- 线程相关的代码写在该方法中，一般需要重写，run方法中的代码称为线程体
            * void start() -- 启动线程的方法
            * static void sleep(long millis) -- 线程休眠 m毫秒的方法
            * void join() -- 优先执行调用join()方法的线程，用于抢占资源
            * final void join(long millis) -- 调用该join()方法的线程执行millis毫秒后不管该线程有没有执行完，其他线程都可以执行了
        * Runnable接口
            * 只有一个run()方法
            * Runnable是Java中用以实现线程的接口
            * 任何实现线程功能的类都必须实现该接口
            
3、为什么要实现Runnable接口
    * Java不支持多继承
    * 不打算重写Thread类的其他方法
    
4、线程的生命周期
    * 新建(New)
    * 就绪(或叫可运行)(Runnable)
    * 运行(Running)
    * 阻塞(Blocked)
    * 终止(Dead)
    
5、Thread类方法的应用
    * sleep方法：在指定的毫秒数内让正在执行的线程休眠(暂停执行)
    * join方法：等待调用该方法的线程执行结束后其他线程才执行
    
6、线程优先级(主线程默认优先级为5)
    * Java为线程类提供了10个优先级别，用整数1-10表示，数值越大优先级越高，超过范围会抛出异常
    * 优先级常量
        * MAX_PRIORITY：代表线程的最高优先级10
        * MIN_PRIORITY：线程的最低优先级1
        * NORM_PRIORITY：线程优先级默认为5
    * 优先级相关的方法
        * int getPriority() -- 获取线程优先级的方法
        * void setPriority(int newPriority) -- 设置线程优先级的方法
        
7、线程同步
    * 多线程运行问题(线程执行随机性)
        * 各个线程是通过竞争CPU时间而获得运行机会
        * 各个线程什么时间获得CPU、占用多久，都是不可预测的
        * 一个正在运行的线程在什么地方被暂停是不确定的
    * 使用关键字synchronized实现
        * synchronized使用位置
            * 成员方法：public synchronized void saveAccount(){}
            * 静态方法：
            * 语句块：synchronized (this) {}
            
8、线程间的通信
    * wait()方法：中断方法的执行，使线程等待，进入阻塞状态
    * notify()方法：唤醒处于等待的某一个线程，使其结束等待，进入就绪状态
    * notifyAll()方法：唤醒所有处于等待的线程，使它们结束等待，进入就绪状态