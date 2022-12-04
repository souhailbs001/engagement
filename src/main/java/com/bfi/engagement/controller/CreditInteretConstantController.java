package com.bfi.engagement.controller;

import com.bfi.engagement.entities.CreditInteretConstant;
import com.bfi.engagement.services.CreditInteretConstantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/amortissementConstant")
public class CreditInteretConstantController {
    @Autowired
    CreditInteretConstantService creditInteretConstantService;

    @RequestMapping(value = "/table", method = RequestMethod.POST)
    public CreditInteretConstant tableauAmortissement(@RequestBody CreditInteretConstant creditInteretConstant) {
        return creditInteretConstantService.getTableauArmotissement(creditInteretConstant);
    }

    @RequestMapping (value = "/demandeCreditList", method = RequestMethod.GET)
    public List<CreditInteretConstant> getDemandeCredit(){
        return creditInteretConstantService.getallCredit();
    }

    @RequestMapping(value = "/accepterCredit/{id}", method = RequestMethod.PUT)
    public CreditInteretConstant accepterCredit(@PathVariable(name = "id") Long id) {
        return  creditInteretConstantService.accepterCredit(id);
    }

    @RequestMapping(value = "/refuserCredit/{id}", method = RequestMethod.PUT)
    public CreditInteretConstant refuserCredit(@PathVariable(name = "id") Long id) {
        return  creditInteretConstantService.refuserCredit(id);
    }
}
