package com.beautyhub.Controllers;

import com.beautyhub.DTO.UserResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/masters")
@Validated
public class MasterController {

    // Пример метода для создания нового мастера
    @PostMapping("/create")
    public ResponseEntity<String> createMaster(@Valid @RequestBody UserResponseDTO masterDTO) {
        // Логика создания мастера (возможно, сохранение в базе данных)
        return ResponseEntity.ok("Мастер успешно создан");
    }

    // Пример метода для получения данных мастера по ID
    @GetMapping("/{id}")
    public ResponseEntity<String> getMasterById(@PathVariable Long id) {
        // Логика получения мастера из базы данных по ID
        return ResponseEntity.ok("Информация о мастере с ID: " + id);
    }

    // Пример метода для обновления данных мастера
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateMaster(@PathVariable Long id, @Valid @RequestBody UserResponseDTO masterDTO) {
        // Логика обновления информации о мастере в базе данных
        return ResponseEntity.ok("Мастер с ID " + id + " успешно обновлён");
    }

    // Пример метода для удаления мастера по ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMaster(@PathVariable Long id) {
        // Логика удаления мастера из базы данных
        return ResponseEntity.ok("Мастер с ID " + id + " успешно удалён");
    }
}
