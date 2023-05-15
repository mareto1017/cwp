package com.example.cwp.entity;

import com.example.cwp.dto.Category;
import com.example.cwp.dto.GroupDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user_group")
public class Group {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String title;

    @ManyToOne
    @JoinColumn(name = "writer")
    private User user;

    @Column(nullable = true)
    private String location;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Category category;

    @Column(nullable = true)
    private String content;

    @OneToMany(mappedBy = "group", fetch = FetchType.EAGER)
    private List<GroupMember> groupMember;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Temporal(TemporalType.TIME)
    private Date time;

    public Group(GroupDto groupDto) {
        this.id=groupDto.getId();
        this.title = groupDto.getTitle();
        this.location = groupDto.getLocation();
        this.category = groupDto.getCategory();
        this.content = groupDto.getContent();
        this.groupMember = getGroupMember();
        this.createdAt = groupDto.getCreateAt();
        this.date = groupDto.getDate();
        this.time = groupDto.getTime();

    }


}
