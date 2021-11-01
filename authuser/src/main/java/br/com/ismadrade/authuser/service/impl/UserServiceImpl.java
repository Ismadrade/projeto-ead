package br.com.ismadrade.authuser.service.impl;

import br.com.ismadrade.authuser.repositories.UserRepository;
import br.com.ismadrade.authuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
}
