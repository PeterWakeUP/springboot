package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 苏文辉 on 2018/3/30.
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    //查询全部
    @GetMapping(value = "/user")
    public List<User> userList() {
        return userRepository.findAll();
    }

    //添加一个用户
    @PostMapping("/user")
    public User userAdd(@RequestParam(value = "userName") String userName, @RequestParam(value = "password") String password) {
        User user = new User();
        user.setPassword(password);
        user.setUserName(userName);
        return userRepository.save(user);
    }

    //查询一个用户
//    @GetMapping("/user/{id}")
//    public User userFindOne(@PathVariable(value = "id") Integer id) {
//        User user = new User();
//        user.setId(id);
//        return userRepository.findById(id);
//    }

    //更新一个用户
    @PutMapping("/user/{id}")
    public User userUpdate(@PathVariable(value = "id") Integer id, @RequestParam(value = "userName") String userName, @RequestParam(value = "password") String password) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setId(id);
        return userRepository.save(user);
    }

    //删除一个用户
    @DeleteMapping("/user/{id}")
    public void userDeleteOne(@PathVariable(value = "id") Integer id) {
        userRepository.deleteById(id);
    }


    //通过userName查询
    @GetMapping("user/userName/{userName}")
    public List<User> userByUserName(@PathVariable(value = "userName")String userName){
        return userRepository.findByUserName(userName);
    }

}
