package br.com.ismadrade.course.services;

import br.com.ismadrade.course.models.CourseModel;
import br.com.ismadrade.course.models.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.UUID;

public interface UserService {

    Page<UserModel> findAll(Specification<UserModel> spec, Pageable pageable);

    UserModel save(UserModel userModel);
}
