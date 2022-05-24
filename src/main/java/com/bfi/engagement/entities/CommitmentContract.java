package com.bfi.engagement.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("CommitmentContract")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public abstract class CommitmentContract extends Contrat {
    private DurationUnit durationUnit;
    private double incurredInternalRisk;
    private double incurredLegalRisk;
    private String rib;
    private double affectedAmount;
    private double accountingAvailableAmount;
    private boolean possibleClassChange;
    private Date dateSituation;
    private boolean manualReclassement;


}
