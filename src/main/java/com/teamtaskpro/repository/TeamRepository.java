package com.teamtaskpro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamtaskpro.entities.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team , Long> {
            Optional<Team> findByName(String name);
            Optional<Team> finadByTeamLeaderId(String leaderId);
}
