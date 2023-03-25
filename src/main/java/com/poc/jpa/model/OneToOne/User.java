package com.poc.jpa.model.OneToOne;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "user_id")
    private Long UserId;
    private String userName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_cniC_id")
    private CNic cNic;


    }



