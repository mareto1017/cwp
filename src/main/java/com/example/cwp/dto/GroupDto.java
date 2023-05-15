package com.example.cwp.dto;

import com.example.cwp.entity.Group;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GroupDto {

    private Long id;

    private String title;

    private UserDto userDto;

    private String location;

    private Category category;

    private String content;

    private List<GroupMemberDto> groupMemberDto;

    private LocalDateTime createAt;

    private Date date;

    private LocalTime time;


    public GroupDto(Group group) {
        this.id = group.getId();
        this.title = group.getTitle();
        this.userDto = getUserDto();
        this.location = group.getLocation();
        this.category = group.getCategory();
        this.content = group.getContent();
        this.groupMemberDto = getGroupMemberDto();
        this.createAt = group.getCreatedAt();
        this.date = group.getDate();
        this.time = group.getTime();
    }
}
