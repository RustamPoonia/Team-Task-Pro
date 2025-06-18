package com.teamtaskpro.services;

import java.util.List;

import com.teamtaskpro.DTOs.CreateUserRequest;
import com.teamtaskpro.DTOs.UserDTO;
import com.teamtaskpro.entities.User;
import com.teamtaskpro.enums.Role;

public interface UserService {
  UserDTO createUser(CreateUserRequest request);

  UserDTO getUserById(Long id);
  UserDTO getUserByEmail(String email);
  
  List<User> getUserByRole(Role role);
  List<User> getUserByTeamId(Long teamId);

  void deleteUser(Long id);
}
