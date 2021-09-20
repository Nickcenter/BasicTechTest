package com.example.springTest.循环依赖;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 刘秦川 on 2021/8/29.
 * Description：
 */
public class ClientSpringContainer {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        A a = context.getBean("a", A.class);
        B b = context.getBean("b", B.class);
    }
}