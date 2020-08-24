package com.huazi.async.controller;

import com.huazi.async.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/hello")
    public String hello(){
        asyncService.hello();//停止三秒相应OK
        return "OK";
    }
}
