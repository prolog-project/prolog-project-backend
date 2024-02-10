package com.prolog.prologbackend.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Positive;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : Kim
 * date : 2024-02-10
 * description : 단순 테스트입니다~
 */

@Tag(name = "Test 컨트롤러", description = "Test API입니다.") // 그룹 설정
@RestController
public class SwaggerTestController {

    @GetMapping("/testSwagger")
    @Operation(summary = "테스트용입니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공"),
            @ApiResponse(responseCode = "404", description = "데이터 없어!"),
    })
    public String findByEmail(
            @Parameter(name = "User", description = "회원 아이디?", example = "3", required = true)
            @Positive(message = "유저 ID는 양수입니다.") @RequestParam final String name){
        return name;
    }
}

