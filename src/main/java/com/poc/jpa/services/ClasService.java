package com.poc.jpa.services;

import com.poc.jpa.model.ManyToMany.Clas;
import com.poc.jpa.model.OneToMany.CNicNumber;

import java.util.List;

public interface ClasService {
    Clas saveClas(Clas clas);


    List<Clas> getClasList();
}

