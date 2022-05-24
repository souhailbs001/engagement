package com.bfi.engagement.repositories;

import com.bfi.engagement.entities.CommitmentContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommitmentContractRepository extends JpaRepository<CommitmentContract,Long> {
}
