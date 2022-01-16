package br.com.ismadrade.course.validation;

import br.com.ismadrade.course.dtos.CourseDto;
import br.com.ismadrade.course.enums.UserType;
import br.com.ismadrade.course.models.UserModel;
import br.com.ismadrade.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;
import java.util.UUID;

@Component
public class CourseValidator implements Validator {

    @Autowired
    UserService userService;

    @Autowired
    @Qualifier("defaultValidator")
    private Validator validator;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        CourseDto courseDto = (CourseDto) target;
        validator.validate(courseDto, errors);
        if(!errors.hasErrors()){
            validateUserInstructor(courseDto.getUserInstructor(), errors);
        }
    }

    private void validateUserInstructor(UUID userInstructor, Errors errors){
        Optional<UserModel> userModelOptional = userService.findById(userInstructor);
        if(!userModelOptional.isPresent()){
            errors.rejectValue("userInstructor", "UserInstructorError", "Instructor not found.");
        }
        if(userModelOptional.get().getUserType().equals(UserType.STUDENT.toString())){
            errors.rejectValue("userInstructor", "UserInstructorError", "User must be INSTRUCTOR or ADMIN");
        }
    }
}
