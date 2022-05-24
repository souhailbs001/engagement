package com.bfi.engagement.services;

import com.bfi.engagement.entities.Rdv;

import java.text.ParseException;
import java.util.List;

public interface RdvService {
    public Rdv saveRdv(Rdv rdVous);
    public List<Rdv> rdVous();
    public Rdv updateRdv(Long id , Rdv rdVous);
    public Rdv accepterRdv(Long id);
    public Rdv refuserRdv(Long id);
    public Rdv annulerRdv(Long id);
    public Rdv findRdvById(Long id);
}
