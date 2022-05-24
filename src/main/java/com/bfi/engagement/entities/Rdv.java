package com.bfi.engagement.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rdv implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateRdv;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String commentaire;
    @Enumerated(EnumType.STRING)
    private ObjetRdv objet;
    @Enumerated(EnumType.STRING)
    private StatutRdv statutRdv;


}
