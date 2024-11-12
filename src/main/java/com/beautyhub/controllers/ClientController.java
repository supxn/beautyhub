package com.beautyhub.controllers;

import com.beautyhub.dto.ClientDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/clients")
@Validated
public class ClientController {

    @PostMapping("/create")
    public ResponseEntity<String> createClient(@Valid @RequestBody ClientDTO clientDTO) {
        // Если валидация пройдет, выполнится этот код
        return ResponseEntity.ok("Клиент успешно создан");
    }
}
