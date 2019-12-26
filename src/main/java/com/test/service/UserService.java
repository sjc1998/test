package com.test.service;

import com.test.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public interface UserService {
    User Sel(int id);
}