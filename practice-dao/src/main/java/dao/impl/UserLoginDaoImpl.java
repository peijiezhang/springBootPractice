package dao.impl;

import dao.UserLoginDao;
import dto.data.User;
import dto.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserLoginDaoImpl implements UserLoginDao {


    @Autowired
    UserMapper userMapper;

    @Override
    public boolean login(User user) {
        User login = userMapper.login(user.getUserName(), user.getPassWord());
        if(login.getUserName()==null&& login.getPassWord()==null){
            return false;
        }
        return true;
    }
}
