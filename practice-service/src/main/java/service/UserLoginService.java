package service;


import dto.data.User;
import org.springframework.stereotype.Service;

@Service
public interface UserLoginService {
    public boolean login(User user);

}
