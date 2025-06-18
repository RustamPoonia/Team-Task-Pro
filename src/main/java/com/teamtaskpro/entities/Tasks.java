package com.teamtaskpro.entities;

import java.time.LocalDate;

import com.teamtaskpro.enums.TaskStatus;

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
@Table(name="tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String descString;

    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    private String priority;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;
    
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

}

