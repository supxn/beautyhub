package com.beautyhub.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MasterDTO {
    private Long id;

    @NotBlank(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 50, message = "Имя должно быть от 2 до 50 символов")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Имя должно содержать только буквы, без специальных символов")
    private String firstName;

    @NotBlank(message = "Фамилия не должна быть пустой")
    @Size(min = 2, max = 50, message = "Фамилия должна быть от 2 до 50 символов")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Фамилия должна содержать только буквы, без специальных символов")
    private String lastName;

    @NotBlank(message = "Электронная почта не должна быть пустой")
    @Email(message = "Некорректный формат электронной почты")
    private String email;

    @NotBlank(message = "Телефон не должен быть пустым")
    @Pattern(regexp = "^[+]?[0-9]{10,15}$", message = "Телефон должен быть в формате международного номера, от 10 до 15 цифр, может начинаться с +")
    private String phone;

    @NotBlank(message = "Пароль не должен быть пустым")
    @Size(min = 6, max = 100, message = "Пароль должен быть от 6 до 100 символов")
    private String password;

    @NotBlank(message = "Город не должен быть пустым")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Название города должно содержать только буквы, без специальных символов")
    @Size(min = 2, max = 100, message = "Город должен быть от 2 до 100 символов")
    private String city;

    // Дополнительные поля мастера
    @Size(max = 500, message = "Комментарий не должен превышать 500 символов")
    private String comment;

    private Boolean homeVisit; // Не требует валидации

    private Boolean sanPinCompliance; // Не требует валидации

    // Геттеры и сеттеры
}
