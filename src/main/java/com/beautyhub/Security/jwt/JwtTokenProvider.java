package com.beautyhub.Security.jwt;

import com.beautyhub.Entity.User;

import com.beautyhub.Enum.UserRole;
import io.jsonwebtoken.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.Base64;
import java.util.Date;
import java.util.List;

@Component
public class JwtTokenProvider {
    @Value("${jwt.token.secret}")
    private String secret;

    @Value("${jwt.token.expired}")
    private long tokenValidityInSeconds;

    @Autowired
    private UserDetailsService userDetailsService;

    @PostConstruct
    protected void init() {
        secret = Base64.getEncoder().encodeToString(secret.getBytes());
    }

    // Генерация JWT-токена
    public String generateToken(String username, UserRole role) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + tokenValidityInSeconds * 1000);

        return Jwts.builder()
                .setSubject(username)  // Помещаем имя пользователя в subject
                .claim("role", role.name())  // Добавляем роль в токен
                .setIssuedAt(now)  // Время создания токена
                .setExpiration(expiryDate)  // Время истечения токена
                .signWith(SignatureAlgorithm.HS512, secret)  // Подписываем токен
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(secret)  // Устанавливаем секретный ключ
                    .parseClaimsJws(token).getBody();  // Парсим токен

            // Проверяем срок действия токена
            if (claims.getExpiration().before(new Date())) {
                return false;  // Токен истек
            }

            return true;  // Токен валиден
        } catch (JwtException | IllegalArgumentException e) {
            // Логируем и выбрасываем исключение, если токен некорректный
            throw new JwtAuthenticationException("JWT token is expired or invalid", e);
        }
    }

    public Authentication getAuthentication(String token) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(getUsername(token));
        return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
    }

    public String getUsername(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }

    // Извлечение роли из JWT-токена
    private UserRole getUserRole(String token) {
        Claims claims = getClaimsFromToken(token);
        return UserRole.valueOf(claims.get("role", String.class));  // Получаем роль из токена
    }


    private Claims getClaimsFromToken(String token) {
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();  // Извлекаем тело (claims) из токена
    }
}
