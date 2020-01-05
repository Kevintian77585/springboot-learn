package com.kevin.chapter1.interfacedemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author kevin
 * @ClassName
 * @Date 2020/1/518:16
 */
@Component
@Configuration
public class Dog implements Animal {

    @Override
    public void use() {
        System.out.println("狗【+"+Dog.class.getSimpleName()+"+】是看门用的");
    }
}

