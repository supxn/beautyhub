package com.beautyhub.Service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import com.beautyhub.Entity.User;
import java.util.List;
import java.util.stream.IntStream;


public interface UserService{
    List<User> findAllUsers();
    //List<User> allUsers();
    User saveUser(User user);
    User findByEmail(String email);
    User updateUser(User user);
    void deleteUser(String email);
    User userById(long id);
}