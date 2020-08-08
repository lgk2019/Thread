package com.lgk.thread;

/**
 * @author : lgk
 * @Description :继承一个类就要实现它的所有方法
 * @ClassName : Test
 * @date : 2020-8-7 0007
 **/
public class Test extends Test1{
    public static void main(String[] args) {
        Test t = new Test();
        t.method1();
        t.method2();
    }
}
class Test1{
    public void method1(){
        System.out.println("1");
    }
    public void method2(){
        System.out.println("2");
    }
    private void method3(){
        System.out.println("3");
    }
}