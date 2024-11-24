package com.beautyhub.Controllers;

import com.beautyhub.Entity.User;
import com.beautyhub.Service.UserService;
import com.beautyhub.DTO.UserResponseDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Validated
public class UserController {
    private UserService service;

    @PostMapping("/create")
    public ResponseEntity<String> createClient(@Valid @RequestBody UserResponseDTO userDTO) {
        // Если валидация пройдет, выполнится этот код
        return ResponseEntity.ok("Клиент успешно создан");
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome";
    }

    @GetMapping("/all-users")
    public List<User> allUsers(){
        return service.findAllUsers();
    }


}
