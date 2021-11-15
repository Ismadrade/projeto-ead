package br.com.ismadrade.course.services.impl;

import br.com.ismadrade.course.models.LessonModel;
import br.com.ismadrade.course.models.ModuleModel;
import br.com.ismadrade.course.repositories.LessonRepository;
import br.com.ismadrade.course.repositories.ModuleRepository;
import br.com.ismadrade.course.services.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    ModuleRepository moduleRepository;

    @Autowired
    LessonRepository lessonRepository;

    @Transactional
    @Override
    public void delete(ModuleModel moduleModel) {
        List<LessonModel> lessonModelList = lessonRepository.findAllLessonsIntoModule(moduleModel.getModuleId());
        if (!lessonModelList.isEmpty()){
            lessonRepository.deleteAll(lessonModelList);
        }
        moduleRepository.delete(moduleModel);
    }
}
