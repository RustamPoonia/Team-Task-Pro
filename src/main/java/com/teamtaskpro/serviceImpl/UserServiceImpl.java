package com.teamtaskpro.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.teamtaskpro.DTOs.CreateUserRequest;
import com.teamtaskpro.DTOs.UserDTO;
import com.teamtaskpro.entities.User;
import com.teamtaskpro.enums.Role;
import com.teamtaskpro.repository.UserRepository;
import com.teamtaskpro.services.UserService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService  {

    private final UserRepository userRepository;
    @Override
    public UserDTO createUser(CreateUserRequest request) {
      User newUser = ConvertToUserEntity(request);
       if(!userRepository.existsByEmail(request.getEmail())){

             newUser = userRepository.save(newUser);

             return convertToProfileResponse(newUser);
          }

          throw new ResponseStatusException(HttpStatus.CONFLICT,"Email already exists");
    }

    private UserDTO convertToProfileResponse(User newUser) {
           return UserDTO.builder()
                                .id(newUser.getId())
                                .email(newUser.getEmail())
                                .name(newUser.getName())
                                .isEmailVerified(newUser.isEmailVerified())
                                .role(null)
                                .build();
    }

    private User ConvertToUserEntity(CreateUserRequest request) {

        if(request.getPassword() == null || request.getPassword().isEmpty())
        {
             throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Password cannot be null or empty");
        }
           return User.builder()
                                .name(request.getName())
                                .email(request.getEmail())
                                .password(request.getPassword())
                                .emailVerified(false)
                                .verifyEmailOtp(null)
                                .verifyEmailOtpExpired(0L)
                                .resetPassword(null)
                                .resetPasswordOtp(null)
                                .resetOtpExpiredAt(0L)
                                // .role(Role.USER)
                                .build();         
                    }

    @Override
    public UserDTO getUserById(Long id) {
         User existingUser = userRepository.findById(id).orElseThrow(()-> new UsernameNotFoundException("User not found:"+id));
         return convertToProfileResponse(existingUser);
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        User existingUser = userRepository.findByEmail(email).orElseThrow(()-> new UsernameNotFoundException("User not found:"+email));
         return convertToProfileResponse(existingUser);
    }

    @Override
    public List<User> getUserByRole(Role role) {
         List<User> usersForRole = userRepository.findByRole(role);
         return usersForRole; 
    }

    @Override
    public List<User> getUserByTeamId(Long teamId) {
         List<User> usersInTeam = userRepository.findByTeamId(teamId);
         return usersInTeam;
    }

    @Override
    public void deleteUser(Long id) {
         userRepository.deleteById(id);
    }
   
}
