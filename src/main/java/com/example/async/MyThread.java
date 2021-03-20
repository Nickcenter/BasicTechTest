package com.example.async;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nick on 2020/9/13.
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
