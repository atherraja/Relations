package com.poc.jpa.model.ManyToOne;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String employeeName;
    private String employeeCode;

    @ManyToOne
    @JoinColumn(name = "companyId")
    private Company company;
}
