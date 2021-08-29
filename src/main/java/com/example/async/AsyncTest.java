package com.example.async;

/**
 * Created by nick on 2020/9/13.
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
