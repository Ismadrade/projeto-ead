package br.com.ismadrade.course.repositories;

import br.com.ismadrade.course.models.CourseUserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CourseUserRepository  extends JpaRepository<CourseUserModel, UUID> {
}
