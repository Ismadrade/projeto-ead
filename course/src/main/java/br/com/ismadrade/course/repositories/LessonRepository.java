package br.com.ismadrade.course.repositories;

import br.com.ismadrade.course.models.LessonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LessonRepository extends JpaRepository<LessonModel, UUID> {
}
