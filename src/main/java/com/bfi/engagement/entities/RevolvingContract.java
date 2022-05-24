package com.bfi.engagement.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("revolving")
public class RevolvingContract extends CommitmentContract {
    private Date endDate;
    private Long lastLoanPK;
    private Long lastEventPK;
    private double apport;
    private double soldeDave;



}
