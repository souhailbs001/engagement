package com.bfi.engagement.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@DiscriminatorValue("Loan")
public class LoanContract extends CommitmentContract {

}
