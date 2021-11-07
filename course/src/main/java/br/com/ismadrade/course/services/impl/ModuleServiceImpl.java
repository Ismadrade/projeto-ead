package br.com.ismadrade.course.services.impl;

import br.com.ismadrade.course.repositories.ModuleRepository;
import br.com.ismadrade.course.services.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    ModuleRepository moduleRepository;
}
