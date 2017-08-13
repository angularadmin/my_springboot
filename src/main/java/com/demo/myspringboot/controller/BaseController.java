package com.demo.myspringboot.controller;


import com.demo.myspringboot.vo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/base")
public class BaseController {

    /**
    * @date:2017/8/13 0013
    * @author:hadoop
    *
    */
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello springboot";
    }




    /**
    * @date:2017/8/13 0013
    * @author:hadoop
    *
    */
    @RequestMapping(value = "/user")
    public User userShow(){
        User user = new User();
        user.setId(123);
        user.setName("zhangsanfengs");
        return user;
    }
}
