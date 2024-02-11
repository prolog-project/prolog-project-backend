package com.prolog.prologbackend.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 * Author : Kim
 * Date : 2024-02-11
 * Description : 유저 이메일을 받아오는 DTO입니다.
*/
@Getter
@Setter
public class UserEmail {
    @Email
    @NotBlank
    @Schema(description = "사용자의 이메일입니다.", nullable = false, example = "kaw@gmail.com")
    private String email;
}
