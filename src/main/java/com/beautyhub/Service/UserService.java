package com.beautyhub.Service;

import com.beautyhub.DTO.UserRequestDTO;
import com.beautyhub.DTO.UserResponseDTO;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import com.beautyhub.Entity.User;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;


public interface UserService{
    List<User> getList();
    //List<User> allUsers();
    User saveUser(User user);
    User findByEmail(String email);
    User findByUsername(String username);
    void deleteUser(Long id);
    UserResponseDTO GetById(Long id);
    UserResponseDTO update(Long id, UserRequestDTO userRequestDTO);
    User register(User user);

}