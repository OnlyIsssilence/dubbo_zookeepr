package com.onlyisssilence.muya.service;

import com.onlyisssilence.muya.SayHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Author: MuYa
 * Date  : 2017/3/6
 * Description:
 */
public class ConsumerServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"application-dubbo.xml"});
        context.start();
        SayHelloService sayHelloService = (SayHelloService) context.getBean("sayHelloService");
        System.out.println(sayHelloService.sayHello());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
