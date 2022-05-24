package com.bfi.engagement.controller;

import com.bfi.engagement.entities.CreditInteretConstant;
import com.bfi.engagement.services.CreditInteretConstantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/amortissementConstant")
public class CreditInteretConstantController {
    @Autowired
    CreditInteretConstantService creditInteretConstantService;

    @RequestMapping(value = "/table", method = RequestMethod.POST)
    public CreditInteretConstant tableauAmortissement(@RequestBody CreditInteretConstant creditInteretConstant) {
        return creditInteretConstantService.getTableauArmotissement(creditInteretConstant);
    }

}
