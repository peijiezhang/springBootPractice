package com.zpj.dao;


import com.zpj.dto.data.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginDao {

    public boolean login(User user);


}
