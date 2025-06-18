package com.teamtaskpro.DTOs;

import com.teamtaskpro.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserRequest {
        private String name;
        private String email;
        private String password;
        private Role role; 

}
