package com.poc.jpa.dao;

import com.poc.jpa.model.ManyToMany.Clas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasRepository extends JpaRepository<Clas, Long> {
}
