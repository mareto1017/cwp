package com.example.cwp.dto;

import com.example.cwp.entity.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GroupDto {

    private Long id;

    private String title;

    private UserDto userDto;

    private String location;

    private Category category;

    private String content;

    private List<GroupMemberDto> groupMemberDto;

    private LocalDateTime time;

    public GroupDto(Group group) {
        this.title = group.getTitle();
        this.location = group.getLocation();
        this.category = group.getCategory();
        this.content = group.getContent();
        this.time = LocalDateTime.now();
    }
}
