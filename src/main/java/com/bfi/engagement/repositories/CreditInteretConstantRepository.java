package com.bfi.engagement.repositories;

import com.bfi.engagement.entities.CreditInteretConstant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;
import java.util.List;

@RepositoryRestResource
public interface CreditInteretConstantRepository extends JpaRepository<CreditInteretConstant,Long> {

}
