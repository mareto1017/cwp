package com.example.cwp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    private Long id;

    private String name;

    private String email;

    //모임 목록

    private String currentAddress;

    private String homeAddress;

    private String compayAddress;
}
