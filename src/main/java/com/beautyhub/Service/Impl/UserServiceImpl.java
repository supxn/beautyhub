package com.beautyhub.Service.Impl;

import com.beautyhub.DTO.UserRequestDTO;
import com.beautyhub.DTO.UserResponseDTO;
import com.beautyhub.Entity.User;
import com.beautyhub.Enum.UserRole;
import com.beautyhub.Service.UserService;
import com.beautyhub.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    //private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository repository/*, BCryptPasswordEncoder passwordEncoder*/) {
        this.repository = repository;
        //this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User register(User user){
        //user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(UserRole.CLIENT);
        User registeredUser = repository.save(user);
        log.info("IN register - user {} successfully registered", registeredUser);
        return registeredUser;
    }

    @Override
    public List<User> getList(){
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
    public User findByUsername(String username){
        return repository.findByEmail(username);
    }

    @Override
    public UserResponseDTO update(Long id, UserRequestDTO userDTO) {
        return repository.findById(id)
                .map(existingUser -> {
                    existingUser.setUsername(userDTO.getUsername());
                    existingUser.setEmail(userDTO.getEmail());
                    existingUser.setPhone(userDTO.getPhone());
                    existingUser.setFirstName(userDTO.getFirstName());
                    existingUser.setLastName(userDTO.getLastName());
                    existingUser.setPassword(userDTO.getPassword());
                    existingUser.setCity(userDTO.getCity());

                    User updatedUser = repository.save(existingUser);

                    return new UserResponseDTO(
                            updatedUser.getId(),
                            updatedUser.getUsername(),
                            updatedUser.getFirstName(),
                            updatedUser.getLastName(),
                            updatedUser.getPassword(),
                            updatedUser.getEmail(),
                            updatedUser.getCity(),
                            updatedUser.getPhone()
                    );
                })
                .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));
    }

    @Override
    @Transactional
    public void deleteUser(Long id){
        repository.deleteById(id);
    }

    @Override
    public UserResponseDTO GetById(Long id){
        return repository.findById(id)
                .map(user -> new UserResponseDTO(
                        user.getId(),
                        user.getUsername(),
                        user.getFirstName(),
                        user.getLastName(),
                        user.getPassword(),
                        user.getEmail(),
                        user.getCity(),
                        user.getPhone()
                ))
                .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));
    }

}
