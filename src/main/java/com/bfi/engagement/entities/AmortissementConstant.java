package com.bfi.engagement.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmortissementConstant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double valeurInteret;
    private double annuites;
    private double amortissement;
    private double crd;
    private int annee;
    @ManyToOne
    CreditInteretConstant creditInteretConstant;






}
