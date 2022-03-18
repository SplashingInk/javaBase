package com.xtl.jvm;

/**
 * @ClassName StackTest
 * @Description TODO
 * @Author xtl
 * @Date 2022/2/9 17:40
 */
public class StackTest {
    public static void main(String[] args) throws InterruptedException {
        int a=2,b=3;
        int result=a+b;
        Thread.sleep(60000);
        System.out.println("计算结果是："+result);
    }
}
