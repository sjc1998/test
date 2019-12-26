package com.test.service.impl;

import com.test.dao.UserMapper;
import com.test.entity.User;
import com.test.entity.UserExample;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User Sel(int id) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        return userMapper.selectByPrimaryKey(id);
    }

}
