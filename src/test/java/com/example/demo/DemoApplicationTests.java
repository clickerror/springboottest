package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private KeyGenerator keyGenerator;

    @Test
    public void test() {
        System.out.println("---------Redis test-----------");
        System.out.println();
        redisTemplate.opsForValue().set("test","1234");
    }

}
