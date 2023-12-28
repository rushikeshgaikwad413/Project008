package com.example.OMS.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Project {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int projectId;
    private String projectName;
    private String clientName;
    private String Description;
    private String assignedTo;
    private Date startDate;
    private Date endDate;
    private String status;
    private int duration;


    //Constructor
    public Project() {

    }

}
