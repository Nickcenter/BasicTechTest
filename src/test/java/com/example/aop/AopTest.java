package com.example.aop;

/**
 * Created by 刘秦川 on 2021/8/29.
 * Description：
 */
import javax.annotation.Resource;

import com.example.springTest.CalcService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AopTest {

    @Resource
    private CalcService calcService;

    @Test
    public void testAop4() {
        System.out.println(String.format("Spring Verision : %s, Sring Boot Version : %s.", //
                SpringVersion.getVersion(), SpringBootVersion.getVersion()));

        calcService.div(10, 2);
    }
}
