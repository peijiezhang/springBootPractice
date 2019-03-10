package com.zpj.service.impl;

import com.zpj.dao.UserLoginDao;
import com.zpj.dto.data.User;
import com.zpj.dto.mapper.UserMapper;
import com.zpj.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements UserLoginService {
    @Autowired
    private UserLoginDao userLoginDao;

    @Override
    public boolean login(User user) {


        return false;
    }
}
