package com.example.cwp.entity;

import jakarta.persistence.*;

@Entity
public class GroupMember {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "id")
    private Long groupid;


    private String email;
}
