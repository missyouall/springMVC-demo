package com.springmvc.service;

import com.springmvc.entity.User;

/**
 * @Auther: Administrator
 * @Date: 2019/4/22 17:52
 * @Description:
 */
public interface UserService extends BaseService<User> {
    User selectByExample(User user);
}
