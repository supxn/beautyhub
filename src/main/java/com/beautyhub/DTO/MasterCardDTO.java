package com.beautyhub.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.util.List;

public class MasterCardDTO {
    @NotNull(message = "ID мастера не должно быть пустым")
    private Long masterId;

    @Size(max = 5, message = "Можно загрузить до 5 ссылок на фотографии")
    private List<String> photoLinks;

    @Size(max = 3, message = "Можно указать до 3 мессенджеров")
    private List<String> messengerLinks;

    @NotBlank(message = "Ссылка на запись не должна быть пустой")
    private String bookingLink;

    @NotNull(message = "Стаж работы не должен быть пустым")
    private Integer experienceYears;

    @NotBlank(message = "Город не должен быть пустым")
    @Size(min = 2, max = 100, message = "Город должен быть от 2 до 100 символов")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Название города должно содержать только буквы, без специальных символов")
    private String city;

    @Size(max = 10, message = "Можно указать до 10 услуг")
    private List<String> services;

    @NotNull(message = "Поле выезд на дом должно быть указано")
    private Boolean homeVisit;

    @Size(max = 500, message = "Комментарий не должен превышать 500 символов")
    private String comment;

    @NotNull(message = "Поле соблюдения норм СанПиН должно быть указано")
    private Boolean sanPinCompliance;

    // Геттеры и сеттеры
}