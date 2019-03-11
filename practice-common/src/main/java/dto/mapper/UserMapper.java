package dto.mapper;

import dto.data.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    List<User> findUserByName(String name);
    public int insertUser(User user);

    public User login(String userName, String password);


}
