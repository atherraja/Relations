package com.poc.jpa.services.impl;

import com.poc.jpa.dao.ClasRepository;
import com.poc.jpa.model.ManyToMany.Clas;
import com.poc.jpa.services.ClasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasServiceImpl implements ClasService {

    @Autowired
    private ClasRepository clasRepository;

    @Override
    public Clas saveClas(Clas clas) {
        return clasRepository.save(clas);
    }

    @Override
    public List<Clas> getClasList() {
        return clasRepository.findAll();
    }
}
