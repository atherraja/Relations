package com.poc.jpa.model.OneToOne;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cNic")
public class CNic implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "cniC_id")
    private Long cNicId;
    private String permanentAddress;
    private String temporaryAddress;

}






