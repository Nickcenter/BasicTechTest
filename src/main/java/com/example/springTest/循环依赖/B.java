package com.example.springTest.循环依赖;

/**
 * Created by 刘秦川 on 2021/8/29.
 * Description：
 */
public class B {

    private A a;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
        System.out.println("B call setA.");
    }
}
