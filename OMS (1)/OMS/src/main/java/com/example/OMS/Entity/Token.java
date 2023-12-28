package com.example.OMS.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter

public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tokenId;
    private String taskName;
    private String subTaskName;
    private String description;
    private String status;
    private String duration;
    private String comments;
    private Long assignedToUserId;
    private LocalDateTime createDate;
    private LocalDateTime endDate;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long taskId;
    private Long projectId;

}
