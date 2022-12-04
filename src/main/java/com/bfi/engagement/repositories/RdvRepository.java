package com.bfi.engagement.repositories;

import com.bfi.engagement.entities.Rdv;
import com.bfi.engagement.entities.StatutRdv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface RdvRepository extends JpaRepository <Rdv,Long> {
    List<Rdv> findRdvsByStatutRdv(StatutRdv statutRdv);
    Rdv findRdvById(Long id);

}
