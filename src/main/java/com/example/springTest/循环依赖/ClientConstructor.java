package com.example.springTest.循环依赖;

/**
 * Created by 刘秦川 on 2021/8/29.
 * Description：
 */
public class ClientConstructor{
    public static void main(String[] args){
//        new ServiceA(new ServiceB(new ServiceA(new ServiceB())));//这会抛出编译异常
    }
}
