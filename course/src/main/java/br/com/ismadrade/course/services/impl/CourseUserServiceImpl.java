package br.com.ismadrade.course.services.impl;

import br.com.ismadrade.course.repositories.CourseUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseUserServiceImpl {

    @Autowired
    CourseUserRepository courseUserRepository;
}
