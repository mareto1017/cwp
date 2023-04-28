package com.example.cwp.entity;

import com.example.cwp.dto.Category;
import com.example.cwp.dto.GroupDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Group {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime time;

    public Group(GroupDto groupDto) {
        this.title = groupDto.getTitle();
        this.name = groupDto.getName();
        this.location = groupDto.getLocation();
        this.category = groupDto.getCategory();
        this.content = groupDto.getContent();
        this.time = LocalDateTime.now();
    }
}
