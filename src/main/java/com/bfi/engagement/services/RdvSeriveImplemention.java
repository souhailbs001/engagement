package com.bfi.engagement.services;

import com.bfi.engagement.entities.Rdv;
import com.bfi.engagement.entities.StatutRdv;
import com.bfi.engagement.repositories.RdvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RdvSeriveImplemention implements RdvService{
    @Autowired
    RdvRepository rdvRepository;

    @Override
    public Rdv saveRdv(Rdv rdVous) {
        rdVous.setStatutRdv(StatutRdv.En_attente);
        System.out.println(rdVous);
        return rdvRepository.save(rdVous);
    }

    @Override
    public List<Rdv> rdVous()  {
        return this.rdvRepository.findAll() ;
       }



    @Override
    public Rdv updateRdv(Long id, Rdv rdVous) {
        rdVous.setId(id);
        return rdvRepository.save(rdVous);
    }

    @Override
    public Rdv accepterRdv(Long id) {
        Rdv rdv =rdvRepository.getById(id);
        rdv.setStatutRdv(StatutRdv.Validé);
        return this.updateRdv(rdv.getId(),rdv);
    }

    @Override
    public Rdv refuserRdv(Long id) {
        Rdv rdv = rdvRepository.getById(id);
        rdv.setStatutRdv(StatutRdv.Refusé);
        return this.updateRdv(rdv.getId(),rdv);
    }

    @Override
    public Rdv annulerRdv(Long id) {
        Rdv rdv =rdvRepository.getById(id);
        rdv.setStatutRdv(StatutRdv.Annulé);
        return this.updateRdv(rdv.getId(),rdv);
    }

    @Override
    public Rdv findRdvById(Long id) {
        return rdvRepository.findRdvById(id);
    }


}
