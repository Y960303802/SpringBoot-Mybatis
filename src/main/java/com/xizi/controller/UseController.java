package com.xizi.controller;


import com.xizi.mapper.UserMapper;
import com.xizi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UseController {

    @Autowired
    private UserMapper userMapper;


    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        for (User user:users){
            System.out.println(user);
        }
        return users ;
    }

    //添加一个用户
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(4,"刘备","123456"));
        return "ok";
    }


    //修改一个用户
    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(4,"刘备","789123"));

        return "ok";
    }

    //删除用户
    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.delete(4);
        return "ok";
    }


}
