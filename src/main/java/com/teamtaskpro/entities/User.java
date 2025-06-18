package com.teamtaskpro.entities;

import javax.management.relation.Role;

import org.hibernate.internal.build.AllowNonPortable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique=true)
    private String email;

    private String password;
    
    private boolean emailVerified;

    private String verifyEmailOtp;
    private Long verifyEmailOtpExpired;
   
    private String resetPassword;
    private String resetPasswordOtp;
    private Long resetOtpExpiredAt;
    
    @Enumerated(EnumType.STRING)
    private Role role;

  

    @ManyToOne
    @JoinColumn(name = "team")
    private Team team;
}
