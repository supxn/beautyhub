package com.beautyhub.repositories;

import com.beautyhub.DTO.UserRequestDTO;
import com.beautyhub.DTO.UserResponseDTO;
import com.beautyhub.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    void deleteByEmail(String email);
    User findByEmail(String email);
}