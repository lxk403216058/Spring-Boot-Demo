package com.huazi.shiro;

import com.huazi.shiro.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShiroApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        System.out.println(userService.queryById("zhangsan"));
    }

}
