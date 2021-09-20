package com.example.async.公平锁和非公平锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 刘秦川 on 2021/8/29.
 * Description：非公平锁测试  在获取锁的时候和再获取锁的顺序不一致;
 */
public class UnFairLockTest {

    private static final Lock LOCK = new ReentrantLock(true);//改为true就是公平锁

    //食堂
    private static class DiningRoom {
        //获取食物
        public void getFood() {
            try {
                System.out.println(Thread.currentThread().getName()+":正在排队");
                LOCK.lock();
                System.out.println(Thread.currentThread().getName()+":@@@@@@打饭中@@@@@@@");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                LOCK.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DiningRoom diningRoom = new DiningRoom();
        //让5个同学去打饭
        for (int i=0; i<5; i++) {
            new Thread(()->{
                diningRoom.getFood();
            },"同学编号:00"+(i+1)).start();
        }
    }
}