package com.beautyhub.Service;

import org.springframework.stereotype.Service;
import com.beautyhub.Entity.User;
import java.util.List;


public interface UserService{
    List<User> findAllStudent();
    User saveUser(User user);
    User findByEmail(String email);
    User updateUser(User user);
    void deleteUser(String email);
}