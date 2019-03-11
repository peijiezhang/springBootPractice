package dao;


import dto.data.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginDao {

    public boolean login(User user);


}
