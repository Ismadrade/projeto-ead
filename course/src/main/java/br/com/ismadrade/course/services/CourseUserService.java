package br.com.ismadrade.course.services;

import br.com.ismadrade.course.models.CourseModel;
import br.com.ismadrade.course.models.CourseUserModel;

import java.util.UUID;

public interface CourseUserService {
    boolean existsByCourseAndUserId(CourseModel courseModel, UUID userId);

    CourseUserModel save(CourseUserModel courseUserModel);
}
