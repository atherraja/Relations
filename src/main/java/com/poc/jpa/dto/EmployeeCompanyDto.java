package com.poc.jpa.dto;

import lombok.Data;

import java.util.List;

@Data
public class EmployeeCompanyDto {

    private String companyName;
    private String companyStrength;

    private List employee;

}
