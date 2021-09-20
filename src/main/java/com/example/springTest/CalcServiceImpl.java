package com.example.springTest;

import org.springframework.stereotype.Service;

/**
 * Created by 刘秦川 on 2021/8/29.
 * Description：
 */
@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public int div(int x, int y) {
        int result = x / y;
        System.out.println("===>CalcServiceImpl被调用，计算结果为：" + result);
        return result;
    }
}