package com.example.demo.service;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 苏文辉 on 2018/3/30.
 */
//泛型 第一个参数：操作的实体类型， 第二个参数：主键类型~~~
public interface UserRepository extends JpaRepository<User, Integer> {

    //通过userName来查询，函数名严格按照findBy...
    public List<User> findByUserName(String userName);
}
