package com.itheima;

import com.itheima.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Chapter01ApplicationTests {

    @Autowired
    private HelloController helloController;
    @Test
    public void contextLoads() {
        String hello = helloController.hello();
        System.out.println(hello);
    }

}
