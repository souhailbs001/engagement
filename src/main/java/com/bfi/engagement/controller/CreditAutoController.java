package com.bfi.engagement.controller;

import com.bfi.engagement.entities.CreditAuto;
import com.bfi.engagement.entities.Rdv;
import com.bfi.engagement.repositories.CreditAutoRepository;
import com.bfi.engagement.services.CreditAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class CreditAutoController {

    @Autowired
    CreditAutoRepository creditAutoRepository;
    @Autowired
    CreditAutoService creditAutoService;


    @CrossOrigin
    @RequestMapping(value = "/ListCredit", method = RequestMethod.GET)
    public List<CreditAuto> creditAutoList() {
        return creditAutoService.ListCredit();
    }
}

