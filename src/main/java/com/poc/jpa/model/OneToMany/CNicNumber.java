package com.poc.jpa.model.OneToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "CNICNumber")
public class CNicNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cNicNumberId;
    private String Name;
    private String cNicNo;




}
