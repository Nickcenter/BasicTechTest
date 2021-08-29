package com.example.reflect;

import java.lang.reflect.Method;

/**
 * @Title: 反射测试
 * @ClassName: com.example.reflect.ReflectTest.java
 * @Description:
 * @author: 刘秦川
 * @date:  2021-08-29 11:37
 * @version V1.0
 */
public class ReflectTest {

    public static void main(String[] args) {
        try {
            Class<?> wSum = Class.forName("com.example.reflect.ReflectFunc");
            Object object=wSum.newInstance();

            //protected方法通过反射也拿不到，那么反射的意义是什么呢？
            Method wSumMethod=wSum.getMethod("fun",int.class);

            System.out.println(wSumMethod.invoke(object,1));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
