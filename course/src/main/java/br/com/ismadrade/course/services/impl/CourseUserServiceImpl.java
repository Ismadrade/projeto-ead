package br.com.ismadrade.course.services.impl;

import br.com.ismadrade.course.models.CourseModel;
import br.com.ismadrade.course.models.CourseUserModel;
import br.com.ismadrade.course.repositories.CourseUserRepository;
import br.com.ismadrade.course.services.CourseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CourseUserServiceImpl implements CourseUserService {

    @Autowired
    CourseUserRepository courseUserRepository;


    @Override
    public boolean existsByCourseAndUserId(CourseModel courseModel, UUID userId) {
        return courseUserRepository.existsByCourseAndUserId(courseModel,userId);
    }

    @Override
    public CourseUserModel save(CourseUserModel courseUserModel) {
        return courseUserRepository.save(courseUserModel);
    }
}
