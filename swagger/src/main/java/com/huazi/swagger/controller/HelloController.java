package com.huazi.swagger.controller;

import com.huazi.swagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
    //只要接口中返回值中存在实体类，他就会被扫描到Swagger中
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User user(){
        return new User();
    }

    @ApiOperation("hello")
    @RequestMapping(value = "/hello1", method = RequestMethod.POST)
    public String hello(@ApiParam("用户名") String username){
        return "hello";
    }

    @ApiOperation("Post测试")
    @RequestMapping(value = "/postt", method = RequestMethod.POST)
    public User hello(@ApiParam("用户") User user){
        return user;
    }
}
