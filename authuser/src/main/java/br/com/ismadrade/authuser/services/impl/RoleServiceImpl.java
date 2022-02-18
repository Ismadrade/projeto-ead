package br.com.ismadrade.authuser.services.impl;

import br.com.ismadrade.authuser.repositories.RoleRepository;
import br.com.ismadrade.authuser.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;
}
