package com.example.demo.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;

@Repository
public class UserInfoDao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Resource
    private JdbcTemplate jdbcTemplate;

    private String uid;
    private String username;
    private String password;
    private String salt;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 密码盐.
     * @return
     */
    public String getCredentialsSalt(){
        return this.username+this.salt;
    }

    public UserInfoDao getByUsername(String username) {
        String sql = "select * from userinfo where username = ?";
        RowMapper<UserInfoDao> rw = new BeanPropertyRowMapper<UserInfoDao>(UserInfoDao.class);
        return jdbcTemplate.queryForObject(sql, rw, username);
    }

}
