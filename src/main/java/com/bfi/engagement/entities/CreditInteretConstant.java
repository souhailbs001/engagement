package com.bfi.engagement.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.util.annotation.Nullable;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditInteretConstant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double emprunt;
    private double tauxInteret;
    private int duree;
    private double montantPaye;
    private double montantDu;
    private double impayes;
    private Date dateDebut;
    private String reference;

    @Enumerated(EnumType.STRING)
    private StatutDemande statut;
    @OneToMany (mappedBy = "creditInteretConstant")
    private Collection<AmortissementConstant> amortissementConstants;


}
