package com.beautyhub.Controllers;

import com.beautyhub.DTO.ReviewsDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/reviews")
@Validated
public class ReviewsController {

    @PostMapping("/create")
    public ResponseEntity<String> createReview(@Valid @RequestBody ReviewsDTO reviewsDTO) {
        // Логика для создания отзыва
        return ResponseEntity.ok("Отзыв успешно создан");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getReviewById(@PathVariable Long id) {
        // Логика для получения отзыва по ID
        return ResponseEntity.ok("Информация об отзыве с ID: " + id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateReview(@PathVariable Long id, @Valid @RequestBody ReviewsDTO reviewsDTO) {
        // Логика для обновления отзыва
        return ResponseEntity.ok("Отзыв с ID " + id + " успешно обновлён");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteReview(@PathVariable Long id) {
        // Логика для удаления отзыва
        return ResponseEntity.ok("Отзыв с ID " + id + " успешно удалён");
    }
}
