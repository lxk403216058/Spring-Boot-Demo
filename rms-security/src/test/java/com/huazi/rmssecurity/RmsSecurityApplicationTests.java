package com.huazi.rmssecurity;

import com.huazi.rmssecurity.dao.UserDao;
import com.huazi.rmssecurity.model.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RmsSecurityApplicationTests {
    @Autowired(required = false)
    private UserDao userDao;

    @Test
    void contextLoads() {
        SysUser user = userDao.getById(1L);
        user.setEmail("1234@163.com");

        userDao.update(user);
        System.out.println(userDao.getById(1L));
    }

}
