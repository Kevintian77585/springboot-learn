package com.kevin.chapter1.interfacedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author kevin
 * @ClassName
 * @Date 2020/1/518:14
 */
@Component
public class BussinessPerson implements Person {
    @Autowired
    private Animal animal = null;
    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}

