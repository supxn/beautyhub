package com.beautyhub.DTO;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ReviewsDTO {
    private Long id; // Автоматически генерируемое поле, не требует валидации

    @NotNull(message = "ID пользователя не должно быть пустым")
    private Long userId;

    @NotNull(message = "ID мастера не должно быть пустым")
    private Long masterId;

    @NotNull(message = "Рейтинг не должен быть пустым")
    @DecimalMin(value = "1.00", message = "Рейтинг должен быть не менее 1.00")
    @DecimalMax(value = "5.00", message = "Рейтинг должен быть не более 5.00")
    @Digits(integer = 1, fraction = 2, message = "Рейтинг должен быть числом с двумя знаками после запятой")
    private Double rating;

    @NotBlank(message = "Текст отзыва не должен быть пустым")
    @Size(max = 1000, message = "Текст отзыва не должен превышать 1000 символов")
    private String reviewText;

    // Геттеры и сеттеры
}
