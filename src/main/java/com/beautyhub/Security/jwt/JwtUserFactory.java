package com.beautyhub.Security.jwt;

import com.beautyhub.Entity.User;
import com.beautyhub.Enum.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;

public final class JwtUserFactory {
    public JwtUserFactory() {}

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getFirstName(),
                user.getLastName(),
                user.getPassword(),
                null,
                user.getEmail(),
                user.getRole().equals(UserRole.CLIENT),
                null //!!
        );
    }

//    private static List<GrantedAuthority> mapToGrantedAuthoriites(List<UserRole> userRoles){
//        return userRoles
//                .map(role -> new SimpleGrantedAuthority())
//    }
}
