package com.example.async;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: 多线程学习
 * @ClassName: com.example.async.MyThread.java
 * @Description:
 * @author: 刘秦川
 * @date:  2021-08-29 11:36
 * @version V1.0
 */
public class MyThread extends Thread{
    private OnCallbackLintener listener;

    public void setListener(OnCallbackLintener listener) {

        this.listener = listener;

    }

    @Override

    public void run() {

        try {

            Thread.sleep(5000);

            if (null != listener) {

                listener.onCallback("The Callback is from myThread");

            }

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }
}
