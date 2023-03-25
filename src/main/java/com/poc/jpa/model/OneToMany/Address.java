package com.poc.jpa.model.OneToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;
    private String permanentAddress;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CNicNumber> cNicNumbers = new ArrayList <CNicNumber> ();
}
