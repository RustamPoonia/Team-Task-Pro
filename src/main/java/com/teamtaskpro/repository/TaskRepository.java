package com.teamtaskpro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

import com.teamtaskpro.enums.TaskStatus;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> fingByTeamId(Long teamId);
    
    List<Task> findByAssignedToId(Long userId);

    List<Task> findByStatus(TaskStatus status);
}
