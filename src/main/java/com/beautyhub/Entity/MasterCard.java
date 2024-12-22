package com.beautyhub.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "master_cards")
public class MasterCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long masterId;

    @ElementCollection
    private List<String> photoUrls;

    @ElementCollection
    private List<String> messengerLinks;

    private String bookingLink;
    private Integer experienceYears;
    private String city;

    @ElementCollection
    private List<String> services;

    private Boolean homeVisit;
    private String masterComment;
    private Boolean sanPinCompliance;

    // Getters and Setters
}