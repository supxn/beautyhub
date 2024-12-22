package com.beautyhub.Security.jwt;

import com.beautyhub.Entity.User;
import com.beautyhub.Enum.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {
    public JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getFirstName(),
                user.getLastName(),
                user.getPassword(),
                mapToGrantedAuthorities(user.getRoles()),
                user.getEmail(),
                //user.getRoles().equals(UserRole.CLIENT),
                null //user.getUpdated()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(UserRole userRole) {
        return List.of(new SimpleGrantedAuthority(userRole.toString()));
    }
}
