package br.com.ismadrade.authuser.services;

import br.com.ismadrade.authuser.enums.RoleType;
import br.com.ismadrade.authuser.models.RoleModel;

import java.util.Optional;

public interface RoleService {
    Optional<RoleModel> findByRoleName(RoleType roleType);
}
