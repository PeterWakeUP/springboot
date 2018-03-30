package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 苏文辉 on 2018/3/30.
 */
@RestController
public class Test {

    @RequestMapping("Test/say")
    public String say(){
        return "Hello";
    }
}
