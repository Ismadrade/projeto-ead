package br.com.ismadrade.authuser.repositories;

import br.com.ismadrade.authuser.models.UserCourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserCourseRepository extends JpaRepository<UserCourseModel, UUID> {
}
