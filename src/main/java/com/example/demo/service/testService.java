package com.example.demo.service;

import com.example.demo.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class testService {
    @Resource
    private TestDao testDao;

    public TestDao getById(int id){
        return testDao.getTestById(id);
    }
}
