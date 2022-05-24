package com.bfi.engagement.repositories;

import com.bfi.engagement.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
