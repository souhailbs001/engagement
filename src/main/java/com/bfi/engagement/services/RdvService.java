package com.bfi.engagement.services;

import com.bfi.engagement.entities.Rdv;

import java.text.ParseException;
import java.util.List;

public interface RdvService {
    Rdv saveRdv(Rdv rdVous);
    List<Rdv> rdVous();
    Rdv updateRdv(Long id, Rdv rdVous);
    Rdv accepterRdv(Long id);
    Rdv refuserRdv(Long id);
    Rdv annulerRdv(Long id);
    Rdv findRdvById(Long id);
}
