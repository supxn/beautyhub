package com.beautyhub.Controllers;

import com.beautyhub.DTO.MasterCardDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/mastercards")
@Validated
public class MasterCardController {

    @PostMapping("/create")
    public ResponseEntity<String> createMasterCard(@Valid @RequestBody MasterCardDTO masterCardDTO) {
        // Логика для создания карточки мастера
        return ResponseEntity.ok("Карточка мастера успешно создана");
    }

    @GetMapping("/{masterId}")
    public ResponseEntity<String> getMasterCardByMasterId(@PathVariable Long masterId) {
        // Логика для получения карточки мастера по ID мастера
        return ResponseEntity.ok("Информация о карточке мастера с ID: " + masterId);
    }

    @PutMapping("/update/{masterId}")
    public ResponseEntity<String> updateMasterCard(@PathVariable Long masterId, @Valid @RequestBody MasterCardDTO masterCardDTO) {
        // Логика для обновления карточки мастера
        return ResponseEntity.ok("Карточка мастера с ID " + masterId + " успешно обновлена");
    }

    @DeleteMapping("/delete/{masterId}")
    public ResponseEntity<String> deleteMasterCard(@PathVariable Long masterId) {
        // Логика для удаления карточки мастера
        return ResponseEntity.ok("Карточка мастера с ID " + masterId + " успешно удалена");
    }
}