package com.example.demo.test;
//// SpringJUnit支持，由此引入Spring-Test框架支持！

import com.example.demo.DemoApplication;
import com.example.demo.service.helloService;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.servlet.Servlet;

@RunWith(SpringJUnit4ClassRunner.class)
//// 指定我们SpringBoot工程的Application启动类
@SpringBootTest(classes = DemoApplication.class)
///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class HelloServiceTest {

    @Resource
    private helloService helloServlet;

    public void testHelloService(){
        Assert.assertEquals("hello",helloServlet.hello());
    }
}
