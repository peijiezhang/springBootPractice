package service.impl;

import dao.UserLoginDao;
import dto.data.User;
import service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements UserLoginService {

    @Autowired
    UserLoginDao userLoginDao;

    @Override
    public boolean login(User user) {
        boolean login = userLoginDao.login(user);

        return login;
    }
}
