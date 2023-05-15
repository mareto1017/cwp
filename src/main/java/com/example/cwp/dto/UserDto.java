package com.example.cwp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {

    private Long id;

    private String name;

    private String email;

    private String provider;

    private String providerId;

    private String currentAddress;

    private String homeAddress;

    private String companyAddress;
}
