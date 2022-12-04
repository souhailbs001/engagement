package com.bfi.engagement.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="c")
public abstract class Contrat implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    private StatutDemande statutDemande;
    private String reference;
    private boolean renevable;
    private Date startDate;
    private Date endtDate;
    private boolean active;
    private boolean close;
    private String conventionInformation;
    private String migState;
    private String strc;






}
