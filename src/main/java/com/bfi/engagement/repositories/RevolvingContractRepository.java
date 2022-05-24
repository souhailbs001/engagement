package com.bfi.engagement.repositories;

import com.bfi.engagement.entities.RevolvingContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface RevolvingContractRepository extends JpaRepository<RevolvingContract,Long> {
}
