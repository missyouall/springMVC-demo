package com.springmvc.service.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.springmvc.dao.UserMapper;
import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/4/22 17:53
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public User add(User user) {
        userMapper.insert(user);
        return user;
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public User get(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delete(Integer[] id_array) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int findCount(User obj) {
        return 0;
    }

    @Override
    public List<User> getList(User obj) {
        return null;
    }

    @Override
    public User selectByExample(User user) {
        return userMapper.selectByExample(user);
    }
}
