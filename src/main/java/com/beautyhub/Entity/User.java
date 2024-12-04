package com.beautyhub.Entity;

import com.beautyhub.Enum.UserRole;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;
import javax.persistence.*;


@Table(name = "clients")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{
        @Id
        private Long id;
        private String username;
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private String password;
        private String city;
}