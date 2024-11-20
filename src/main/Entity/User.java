package com.beautyhub.beautyhub;

import com.beautyhub.enums;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder(toBuilder = true)
@Table("users")
public  class User{
    private Long id;
    private String first_nmae;
    private String last_name;
    private String password;
    private UserRole role;
    private String email;
    private String city;
    private String phone_number
}