package com.beautyhub.Controllers;


import com.beautyhub.DTO.UserResponseDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
@Validated
public class UserController {
    @PostMapping("/create")
    public ResponseEntity<String> createClient(@Valid @RequestBody UserResponseDTO userDTO) {
        // Если валидация пройдет, выполнится этот код
        return ResponseEntity.ok("Клиент успешно создан");
    }
}
