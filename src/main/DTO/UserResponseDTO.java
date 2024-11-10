package com.beautyhub.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Builder(toBuilder = true)
public class UserResponseDTO{
    private Long id;
    private String first_nmae;
    private String last_name;
    private String password;
    private UserRole role;
    private String email;
    private String city;
    private String phone_number
}