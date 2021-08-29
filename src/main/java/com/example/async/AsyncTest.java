package com.example.async;

/**
 * @Title: 多线程测试
 * @ClassName: com.example.async.AsyncTest.java
 * @Description:
 * @author: 刘秦川
 * @date:  2021-08-29 11:36
 * @version V1.0
 */
public class AsyncTest {
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.setListener(new OnCallbackLintener() {

            @Override
            public void onCallback(String text) {
                System.out.println(text);
            }
        });
        thread.start();

    }
}
