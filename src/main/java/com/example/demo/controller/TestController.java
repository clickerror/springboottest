package com.example.demo.controller;

import com.example.demo.dao.TestDao;
import com.example.demo.service.testService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class TestController {
    @Resource
    private testService testService;

    @RequestMapping("/")
    private String helloWorld() {
        return "hello World!";
    }

    @RequestMapping("/test")
    private TestDao getTest() {
        TestDao testDao = new TestDao();
        testDao.setAge(1);
        testDao.setName("aaa");
        testDao.setBirthday(new Date());
        return testDao;
    }

    @RequestMapping("/exception")
    public String zeroException() {
        Object o = null;
        return o.toString();
    }

    @RequestMapping("/getbyid")
    public TestDao getTestById(int id){
        return testService.getById(id);
    }
}
