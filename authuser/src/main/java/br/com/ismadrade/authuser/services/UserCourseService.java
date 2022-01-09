package br.com.ismadrade.authuser.services;

import br.com.ismadrade.authuser.models.UserCourseModel;
import br.com.ismadrade.authuser.models.UserModel;

import java.util.UUID;

public interface UserCourseService {
    boolean existsByUserAndCourseId(UserModel userModel, UUID courseId);

    UserCourseModel save(UserCourseModel userCourseModel);

    boolean existsByCourseId(UUID courseId);
    void deleteUserCourseByCourse(UUID courseId);
}
