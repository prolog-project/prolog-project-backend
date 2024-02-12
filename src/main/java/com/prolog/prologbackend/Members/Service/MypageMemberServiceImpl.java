package com.prolog.prologbackend.Members.Service;

import com.prolog.prologbackend.Members.DTO.UserEmail;
import com.prolog.prologbackend.Members.DTO.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Author : Kim
 * date : 2024-02-11
 * description : 우선은 getUserInfo에서 members entity에 필드를 넣고 난 이후 DTO 내부에서 Entity를 DTO로 변경합시다
 */

@Service
@RequiredArgsConstructor
public class MypageMemberServiceImpl implements MypageMemberService{
    @Override
    public UserInfo getUserInfo(UserEmail userEmail) {
//        members members = mypageRepository.findByEmail(userEmail.getEmail());
        UserInfo userInfo = new UserInfo("asd","asd","asd","asd");
        return userInfo;
    }
}
