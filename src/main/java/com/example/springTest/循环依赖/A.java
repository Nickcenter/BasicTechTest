package com.example.springTest.循环依赖;

/**
 * Created by 刘秦川 on 2021/8/29.
 * Description：
 */
public class A {

    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
        System.out.println("A call setB.");
    }
}
