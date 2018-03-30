package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 苏文辉 on 2018/3/30.
 */

@Entity    //表示这个类对应数据库的一个表， 数据库不用建表就可以生成
public class User {

    @Id //表示该属性为主键
    @GeneratedValue //表示自增
    private Integer id;
    private String userName;
    private String password;

    //必须有无参构造函数
    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
