package com.poc.jpa.services;

import com.poc.jpa.model.ManyToOne.Company;
import com.poc.jpa.model.OneToOne.User;

import java.util.List;

public interface CompanyService {
    Company saveCompany(Company company);

    List<Company> getCompanyList();
}
