package com.poc.jpa.model.ManyToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "clas")
public class Clas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long classId;
    private String className;

    @ManyToMany(targetEntity = Teacher.class)
    private Set teacheSet;

}
