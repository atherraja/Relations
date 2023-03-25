package com.poc.jpa.model.ManyToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teacherId;
    private String teacherName;
    private String subject;

    @ManyToMany(targetEntity = Clas.class)
    private Set clasSet;
}
