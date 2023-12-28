package com.example.OMS.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Token_id" , nullable = false)
    private Long taskId;

    @Column(name = "Task_Name" , length = 250)
    private String taskName;

    @Column(name = "Description" , length = 250)
    private String description;

    @Column(name = "Assigned_To" , length = 30)
    private Long assignedTo;

    @Column(name = "Status")
    private String status;

    @Column(name = "Duration" , length = 45)
    private String duration;

    private Long projectId;
}
