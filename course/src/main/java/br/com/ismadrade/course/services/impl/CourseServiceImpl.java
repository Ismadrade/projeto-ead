package br.com.ismadrade.course.services.impl;

import br.com.ismadrade.course.repositories.CourseRepository;
import br.com.ismadrade.course.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;
}
