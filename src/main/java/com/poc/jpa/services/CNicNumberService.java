package com.poc.jpa.services;

import com.poc.jpa.model.OneToMany.CNicNumber;
import com.poc.jpa.model.OneToOne.User;

import java.util.List;

public interface CNicNumberService {
    CNicNumber saveCNicNumber(CNicNumber cNicNumber);


    List<CNicNumber> getCNicNumberList();
}
