package com.teamtaskpro.services;

import java.util.Optional;

import com.teamtaskpro.entities.Team;

public interface TeamService {
   Team createTeam(Team team);

   Optional<Team> getTeamById(Long id);
    
   Optional<Team> getTeamByName(String name);

   Optional<Team> getTeamByLeaderId(Long leaderId);

   void deleteTeam(Long id);
}
