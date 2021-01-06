package com.vu.project.model;

import javax.persistence.*;
import lombok.*;



@Entity
@Table(name = "todo")
@Data
public class ToDoWork {
    @Id
    private int id ;
    private String title;
    private String detail;
    
}
