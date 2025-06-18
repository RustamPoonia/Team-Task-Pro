package com.teamtaskpro.DTOs;

import com.teamtaskpro.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private Role role;
    private boolean isEmailVerified;
    
    // private Long teamId;

    // private String teamName;
}
