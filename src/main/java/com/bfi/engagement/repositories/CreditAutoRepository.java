package com.bfi.engagement.repositories;

import com.bfi.engagement.entities.CreditAuto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CreditAutoRepository extends JpaRepository<CreditAuto,Long> {
}
