package com.kevin.chapter1.config;

import com.kevin.chapter1.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kevin
 * @ClassName
 * @Date 2020/1/517:50
 */
@Configuration
public class AppConfig {

    @Bean(name = "user")
    public User initUser() {

        User user = new User();
        user.setId(1L);
        user.setUserName("zhangsan");
        user.setNote("note1");
        return user;
    }
}

