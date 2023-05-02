package com.example.cwp.entity;

import jakarta.persistence.*;

@Entity
public class GroupMember {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "member")
    private User user;

}
