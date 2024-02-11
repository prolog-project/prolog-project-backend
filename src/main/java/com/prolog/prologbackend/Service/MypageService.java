package com.prolog.prologbackend.Service;

import com.prolog.prologbackend.DTO.ProjectList;
import com.prolog.prologbackend.DTO.UserEmail;
import com.prolog.prologbackend.DTO.UserInfo;

public interface MypageService {
    UserInfo getUserInfo(UserEmail userEmail);
    ProjectList getProjectList(UserEmail userEmail);
}
