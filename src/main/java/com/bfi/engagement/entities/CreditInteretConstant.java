package com.bfi.engagement.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.util.annotation.Nullable;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditInteretConstant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double Emprunt;
    private double tauxInteret;
    private int duree;
    @Enumerated(EnumType.STRING)
    private StatutContrat statut;
    @OneToMany (mappedBy = "creditInteretConstant")
    private Collection<AmortissementConstant> amortissementConstants;


}
