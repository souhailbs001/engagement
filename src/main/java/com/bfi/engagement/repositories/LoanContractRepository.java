package com.bfi.engagement.repositories;

import com.bfi.engagement.entities.LoanContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface LoanContractRepository extends JpaRepository<LoanContract,Long> {
}
