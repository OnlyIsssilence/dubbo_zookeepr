package com.onlyisssilence.muya.impl;


import com.onlyisssilence.muya.SayHelloService;

/**
 * Author: MuYa
 * Date  : 2017/3/6
 * Description:
 */
public class SayHelloServiceImpl implements SayHelloService {
    public String sayHello() {

        System.out.println("hello world");
        return "say hello service";
    }
}
