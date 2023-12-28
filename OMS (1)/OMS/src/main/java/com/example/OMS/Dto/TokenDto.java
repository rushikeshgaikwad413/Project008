package com.example.OMS.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenDto {

    private Long tokenId;
    private String taskName;
    private String description;
    private String status;
    private String duration;
    private Long assignedToUserId;
    private LocalDate createDate;
    private LocalDate endDate;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
