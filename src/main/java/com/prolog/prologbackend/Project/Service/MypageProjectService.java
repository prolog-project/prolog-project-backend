package com.prolog.prologbackend.Project.Service;

import com.prolog.prologbackend.Project.DTO.ProjectList;
import com.prolog.prologbackend.Members.DTO.UserEmail;

public interface MypageProjectService {
    ProjectList getProjectList(UserEmail userEmail);
}
