package com.vu.project.model;

import javax.persistence.*;
import lombok.*;



@Entity
@Table(name = "todo")
@Data
public class ToDoWork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String title;
    private String detail;
   
}
