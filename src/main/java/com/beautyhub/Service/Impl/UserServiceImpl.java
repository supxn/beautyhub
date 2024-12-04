package com.beautyhub.Service.Impl;

import com.beautyhub.DTO.UserRequestDTO;
import com.beautyhub.DTO.UserResponseDTO;
import com.beautyhub.Entity.User;
import com.beautyhub.Service.UserService;
import com.beautyhub.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;

@Service
@Primary
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository repository;

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
