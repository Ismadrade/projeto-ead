package br.com.ismadrade.authuser.repositories;

import br.com.ismadrade.authuser.enums.RoleType;
import br.com.ismadrade.authuser.models.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, UUID> {

    Optional<RoleModel> findByRoleName(RoleType name);
}
