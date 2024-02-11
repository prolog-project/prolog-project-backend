package com.prolog.prologbackend.Service;

import com.prolog.prologbackend.DTO.ProjectList;
import com.prolog.prologbackend.DTO.UserEmail;
import com.prolog.prologbackend.DTO.UserInfo;
import com.prolog.prologbackend.Domain.members;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * Author : Kim
 * date : 2024-02-11
 * description : 우선은 getUserInfo에서 members entity에 필드를 넣고 난 이후 DTO 내부에서 Entity를 DTO로 변경합시다
 */

@Service
@RequiredArgsConstructor
public class MypageServiceImpl implements MypageService{
//    private final MypageRepository mypageRepository;
    @Override
    public UserInfo getUserInfo(UserEmail userEmail) {
//        members members = mypageRepository.findByEmail(userEmail.getEmail());
        UserInfo userInfo = new UserInfo("asd","asd","asd","asd");
        return userInfo;
    }

    @Override
    public ProjectList getProjectList(UserEmail userEmail) {
        ProjectList projectList = new ProjectList();
        return projectList;
    }
}
