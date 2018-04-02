package com.example.demo.controller;

import com.example.demo.dao.ManMapper;
import com.example.demo.domain.Man;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 苏文辉 on 2018/4/2.
 */
@RestController
public class ManController {

    @Autowired
    ManMapper manMapper;

    @RequestMapping("test")
    public String test(){
        return "ManController";
    }

    @RequestMapping("man/getManById/{id}")
    public String getManById(@PathVariable(value = "id") int id){
        Man man = manMapper.selectById(id);
        String str = "id:"+man.getId()+ ",name:"+ man.getName();
        return str;
    }

}
