package br.com.ismadrade.authuser.services.impl;

import br.com.ismadrade.authuser.enums.RoleType;
import br.com.ismadrade.authuser.models.RoleModel;
import br.com.ismadrade.authuser.repositories.RoleRepository;
import br.com.ismadrade.authuser.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Optional<RoleModel> findByRoleName(RoleType roleType) {
        return roleRepository.findByRoleName(roleType);
    }
}
