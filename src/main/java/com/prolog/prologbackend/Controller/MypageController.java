package com.prolog.prologbackend.Controller;

import com.prolog.prologbackend.DTO.ProjectList;
import com.prolog.prologbackend.DTO.UserEmail;
import com.prolog.prologbackend.DTO.UserInfo;
import com.prolog.prologbackend.Service.MypageService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : Kim
 * date : 2024-02-11
 * description : MyPage 페이지에서 요청되는 API들입니다.
 */

@Tag(name = "MyPage Api", description = "MyPage 페이지에서 요청되는 API들입니다.")
@RestController
@RequestMapping(value = "/mypage")
@RequiredArgsConstructor
public class MypageController {
    private final MypageService mypageService;

    @Operation(summary = "좌측 화면의 유저의 기본적인 정보들을 가져옵니다.")
    @GetMapping("/userinfo")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success" , content = @Content(schema = @Schema(implementation = UserInfo.class))),
            @ApiResponse(responseCode = "400", description = "Fail" , content = @Content(schema = @Schema(implementation = UserEmail.class))),
    })
    public ResponseEntity<UserInfo> getUserInfo(
            @Parameter(name = "email", description = "유저의 이메일입니다.", example = "abcd0000@naver.com", required = true)
            @RequestBody @Validated final UserEmail userEmail
    ){
        UserInfo userInfo = mypageService.getUserInfo(userEmail);
        return ResponseEntity.status(HttpStatus.OK).body(userInfo);
    }

    @Operation(summary = "사용자의 프로젝트 리스트를 반환합니다.")
    @GetMapping("/project-list")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success" , content = @Content(schema = @Schema(implementation = ProjectList.class))),
            @ApiResponse(responseCode = "400", description = "Null"),
    })
    public ResponseEntity<ProjectList> getProjectList(
            @Parameter(name = "email", description = "유저의 이메일입니다.", example = "abcd0000@naver.com", required = true)
            @RequestBody @Validated final UserEmail userEmail
    ){
        ProjectList projectList = mypageService.getProjectList(userEmail);
        return ResponseEntity.status(HttpStatus.OK).body(projectList);
    }
}
