package com.prolog.prologbackend.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 Author : Kim
 Date : 2024-02-11
 description : AllArgsConstructor는 데이터베이스 구축 이후 삭제 예정
*/

@AllArgsConstructor
@Getter
@Setter
public class UserInfo {
    @NotBlank
    private String userImage;
    @NotBlank
    private String name;
    @Email
    private String email;
    @NotBlank
    private String phone;

}
