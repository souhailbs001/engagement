package com.bfi.engagement.controller;
import com.bfi.engagement.entities.Rdv;
import com.bfi.engagement.entities.StatutRdv;
import com.bfi.engagement.repositories.RdvRepository;
import com.bfi.engagement.services.RdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class RdvController {
    @Autowired
    private RdvService rdvService;
    @Autowired
    private RdvRepository rdvRepository;

    @CrossOrigin
    @RequestMapping(value = "/addRdv", method = RequestMethod.POST)
    public Rdv saveRdVous(@RequestBody Rdv rdVous) {
        return rdvService.saveRdv(rdVous);
    }
    @CrossOrigin
    @RequestMapping(value = "/rdvs", method = RequestMethod.GET)
    public List<Rdv> rdVous ()  {
        return  rdvService.rdVous();
    }

    @RequestMapping(value = "/annulerRdv/{id}", method = RequestMethod.PUT)
    public Rdv annulerRDV(@PathVariable(name = "id") Long id) {
        return  rdvService.annulerRdv(id);
    }

    @RequestMapping(value = "/accepterRdv/{id}", method = RequestMethod.PUT)
    public Rdv accepterRdv(@PathVariable(name = "id") Long id) {
        return  rdvService.accepterRdv(id);
    }

    @RequestMapping(value = "/refuserRdv/{id}", method = RequestMethod.PUT)
    public Rdv refuserRdv(@PathVariable(name = "id") Long id) {
        return  rdvService.refuserRdv(id);
    }

    @RequestMapping(value = "/findRdvbyStatut", method = RequestMethod.GET)
    public List<Rdv>findbyStatut(@RequestParam(name = "statut") StatutRdv statut) {
        return rdvRepository.findRdvsByStatutRdv(statut);
    }
    @GetMapping(value = "/findRdvById/{id}")
    public Rdv findRdvById  (@PathVariable(name = "id") Long id) {
        return  rdvService.findRdvById(id);
    }


}
