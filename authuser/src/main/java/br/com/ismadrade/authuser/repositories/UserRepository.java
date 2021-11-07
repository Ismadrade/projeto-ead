package br.com.ismadrade.authuser.repositories;

import br.com.ismadrade.authuser.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID>, JpaSpecificationExecutor<UserModel> {
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
