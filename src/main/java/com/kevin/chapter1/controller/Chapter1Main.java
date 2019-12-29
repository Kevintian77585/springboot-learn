package com.kevin.chapter1.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/2917:23
 */
@Controller
//@EnableAutoConfiguration
public class Chapter1Main {

    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key", "value");
        return map;
    }
}

