package com.zpj.dto.mapper;

import com.zpj.dto.data.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findUserByName(String name);
    public int insertUser(User user);

    public User login(String userName, String password);


}
