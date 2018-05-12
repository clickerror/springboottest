package com.example.demo.service;

import com.example.demo.dao.UserInfoDao;

public interface userInfoService {
    public UserInfoDao getByUsername(String username);
}
