package com.example.cwp.entity;

import com.example.cwp.dto.Category;
import com.example.cwp.dto.GroupDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "writer")
    private User user;

    @Column(nullable = false)
    private String location;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @Column(nullable = false)
    private String content;

    @OneToMany
    @JoinColumn(name = "member")
    private List<GroupMember> groupMember;

    @Column(nullable = false)
    private LocalDateTime time;

    public Group(GroupDto groupDto) {
        this.title = groupDto.getTitle();
        this.location = groupDto.getLocation();
        this.category = groupDto.getCategory();
        this.content = groupDto.getContent();
        this.time = LocalDateTime.now();
    }
}
