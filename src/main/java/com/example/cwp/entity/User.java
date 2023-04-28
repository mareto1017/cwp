package com.example.cwp.entity;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    //모임 목록

    @Column(nullable = false)
    private String currentAddress;

    private String homeAddress;

    private String compayAddress;
}
