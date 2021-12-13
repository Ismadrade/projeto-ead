package br.com.ismadrade.course.dtos;

import br.com.ismadrade.course.enums.UserStatus;
import br.com.ismadrade.course.enums.UserType;
import lombok.Data;

import java.util.UUID;

@Data
public class UserDto {

    private UUID userId;
    private String username;
    private String email;
    private String fullName;
    private UserStatus userStatus;
    private UserType userType;
    private String phoneNumber;
    private String cpf;
    private String imageUrl;
}
