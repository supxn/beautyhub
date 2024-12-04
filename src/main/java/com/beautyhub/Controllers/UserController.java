package com.beautyhub.Controllers;

import com.beautyhub.DTO.UserRequestDTO;
import com.beautyhub.Entity.User;
import com.beautyhub.Service.UserService;
import com.beautyhub.DTO.UserResponseDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Validated
public class UserController {
    private final UserService userService;
    private UserService service;

    @Operation(
            summary = "Создать нового пользователя",
            description = "Создает нового пользователя.")
    @PostMapping("/create")
    public ResponseEntity<String> createClient(@Valid @RequestBody UserResponseDTO userDTO) {
        // Если валидация пройдет, выполнится этот код
        return ResponseEntity.ok("Клиент успешно создан");
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome";
    }

    @Operation(
            summary = "Получить всех пользователей",
            description = "Возвращает список всех пользователей.")
    @GetMapping("/all-users")
    public List<User> allUsers(){
        return service.getList();
    }

    @Operation(
            summary = "Получить пользователя по ID",
            description = "Возвращает пользователя с указанным ID.")
    @GetMapping("/{id}")
    public UserResponseDTO getUser(@PathVariable Long id) {
        return service.GetById(id);
    }

    @Operation(
            summary = "Удалить пользователя",
            description = "Удаляет пользователя с указанным ID.")
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @Operation(
            summary = "Обновить данные пользователя",
            description = "Обновляет данные пользователя с указанным ID.")
    @PatchMapping("/{id}")
    public UserResponseDTO updateUser(@PathVariable Long id, @RequestBody UserRequestDTO userDTO) {
        return userService.update(id, userDTO);
    }
}
