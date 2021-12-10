package br.com.ismadrade.authuser.services.impl;

import br.com.ismadrade.authuser.repositories.UserCourseRepository;
import br.com.ismadrade.authuser.services.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCourseServiceImpl implements UserCourseService {

    @Autowired
    UserCourseRepository userCourseRepository;
}
