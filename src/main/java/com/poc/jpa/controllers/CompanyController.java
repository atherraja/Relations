package com.poc.jpa.controllers;

import com.poc.jpa.dto.EmployeeCompanyDto;
import com.poc.jpa.dto.UserCNicDto;
import com.poc.jpa.model.ManyToOne.Company;
import com.poc.jpa.model.OneToOne.User;
import com.poc.jpa.services.CompanyService;
import com.poc.jpa.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/company/employee")
public class CompanyController {
    @Autowired
    CompanyService companyService;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<EmployeeCompanyDto> saveCompany(@RequestBody EmployeeCompanyDto employeeCompanyDto)
    {
        //Convert DTO entity

        Company companyRequest = modelMapper.map(employeeCompanyDto, Company.class);

        Company company = companyService.saveCompany(companyRequest);

        // Convert entity to DTO

        EmployeeCompanyDto companyResponse = modelMapper.map(company, employeeCompanyDto.getClass());

        return new ResponseEntity<EmployeeCompanyDto>(companyResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public List<EmployeeCompanyDto> getCompanyList()
    {
        return companyService.getCompanyList().stream().map(company -> modelMapper.map(company, EmployeeCompanyDto.class))
                .collect(Collectors.toList());

    }

}
