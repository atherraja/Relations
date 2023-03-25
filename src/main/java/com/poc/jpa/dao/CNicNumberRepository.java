package com.poc.jpa.dao;

import com.poc.jpa.model.OneToMany.CNicNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CNicNumberRepository extends JpaRepository<CNicNumber, Long> {
}
