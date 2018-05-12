package com.example.demo.service.impl;

import com.example.demo.dao.UserInfoDao;
import com.example.demo.service.userInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userInfoServiceImpl implements userInfoService {
    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfoDao getByUsername(String username) {
        return userInfoDao.getByUsername(username);
    }
}