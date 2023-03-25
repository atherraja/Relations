package com.poc.jpa.services.impl;

import com.poc.jpa.dao.CompanyRepository;
import com.poc.jpa.model.ManyToOne.Company;
import com.poc.jpa.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public List<Company> getCompanyList() {
        return companyRepository.findAll();
    }
}
