package com.example.cwp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GroupMemberDto {
    private Long id;

    private UserDto userDto;
}
