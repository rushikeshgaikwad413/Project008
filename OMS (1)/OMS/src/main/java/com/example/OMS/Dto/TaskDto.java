package com.example.OMS.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

    private Long taskId;
    private String taskName;
    private String description;
    private Long assignedTo;
    private String status;
    private String duration;

}
