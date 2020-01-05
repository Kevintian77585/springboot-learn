package com.kevin.chapter1.test;


import com.kevin.chapter1.config.AppConfig;
import com.kevin.chapter1.interfacedemo.BussinessPerson;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author kevin
 * @ClassName
 * @Date 2020/1/517:53
 */
public class IocTest {

    private static Logger logger = Logger.getLogger(IocTest.class);

    public static void main(String[] args) {


       ApplicationContext ac = new AnnotationConfigApplicationContext(BussinessPerson.class);
        /*User user = ac.getBean(User.class);
        logger.info(user.getId()+","+user.getUserName()+","+user.getNote());*/
        BussinessPerson person = ac.getBean(BussinessPerson.class);
        person.service();
    }
}

