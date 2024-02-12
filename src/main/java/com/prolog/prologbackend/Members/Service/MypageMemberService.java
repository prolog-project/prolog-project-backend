package com.prolog.prologbackend.Members.Service;

import com.prolog.prologbackend.Members.DTO.UserEmail;
import com.prolog.prologbackend.Members.DTO.UserInfo;

public interface MypageMemberService {
    UserInfo getUserInfo(UserEmail userEmail);
}
