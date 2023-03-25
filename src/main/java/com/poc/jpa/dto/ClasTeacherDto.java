package com.poc.jpa.dto;

import com.poc.jpa.model.ManyToMany.Teacher;
import lombok.Data;

import java.util.Set;

@Data
public class ClasTeacherDto {
    private String className;

    private Set<Teacher> teacherSet;

}
