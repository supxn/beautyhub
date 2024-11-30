package com.beautyhub.Service.Impl;

import com.beautyhub.Entity.User;
import com.beautyhub.Service.UserService;
import com.beautyhub.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;
@Service
@Primary
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository repository;

    @Override
    public List<User> findAllUsers(){
        return repository.findAll();
    }
    //public List<User> allUsers();
    @Override
    public User saveUser(User user){
        return repository.save(user);
    }
    @Override
    public User findByEmail(String email){
        return repository.findByEmail(email);
    }
    @Override
    public User updateUser(User user){
        return repository.save(user);
    }
    @Override
    @Transactional
    public void deleteUser(String email){
        repository.deleteByEmail(email);
    }
    @Override
    public User userById(long id){
        return repository.findById(id);
    }
}
