package com.bfi.engagement.services;

import com.bfi.engagement.entities.CreditAuto;
import com.bfi.engagement.repositories.CreditAutoRepository;
import com.bfi.engagement.repositories.RdvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CreditAutoServiceImplementation implements CreditAutoService {

    @Autowired
    CreditAutoRepository creditAutoRepository;

    @Override
    public List<CreditAuto> ListCredit() {
        return creditAutoRepository.findAll();
    }
}
