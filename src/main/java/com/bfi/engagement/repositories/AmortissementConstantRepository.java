package com.bfi.engagement.repositories;

import com.bfi.engagement.entities.AmortissementConstant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AmortissementConstantRepository extends JpaRepository<AmortissementConstant,Long> {

}
