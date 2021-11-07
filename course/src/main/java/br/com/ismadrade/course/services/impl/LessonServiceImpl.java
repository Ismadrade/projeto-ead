package br.com.ismadrade.course.services.impl;

import br.com.ismadrade.course.repositories.LessonRepository;
import br.com.ismadrade.course.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    LessonRepository lessonRepository;
}
