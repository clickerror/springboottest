package com.example.demo.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;

@Repository
public class TestDao {
    private int age;
    private String name;
    private Date birthday;

    @Resource
    private JdbcTemplate jdbcTemplate;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public TestDao getTestById(int id) {
        String sql = "select * from test where id = ?";
        RowMapper<TestDao> rw = new BeanPropertyRowMapper<TestDao>(TestDao.class);
        return jdbcTemplate.queryForObject(sql, rw, id);
    }
}
