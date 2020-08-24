package com.huazi.redis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huazi.redis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
class RedisApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        //redisTemplate 操作不同的数据类型
        //opsForValue 操作字符串，类似String

        //常用的方法，可以通过redisTemplate操作，比如事务和基本的增删该查

        RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
        redisTemplate.opsForValue().set("mykey1", "lxk梁细宽");
        System.out.println(redisTemplate.opsForValue().get("mykey1"));
    }

    @Test
    public void test() throws JsonProcessingException {
        //一般用json来传递对象
        User user = new User("梁细宽", 3);
        String jsonUser = new ObjectMapper().writeValueAsString(user);
        //直接传递对象会报错redisTemplate.opsForValue().set("user", user);必须序列化
        redisTemplate.opsForValue().set("user", user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }
}
