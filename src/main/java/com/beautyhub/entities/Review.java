package com.beautyhub.entities;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Float rating;

    @Column(nullable = false)
    private Long clientId;

    @Column(nullable = false)
    private Long masterId;

    private String reviewText;

    // Getters and Setters
}
