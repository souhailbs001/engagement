package com.bfi.engagement.services;


import com.bfi.engagement.entities.CreditInteretConstant;

import java.util.List;

public interface CreditInteretConstantService {
    CreditInteretConstant getTableauArmotissement(CreditInteretConstant creditInteretConstant);
    CreditInteretConstant saveDemandeCredit (CreditInteretConstant creditInteretConstant);

    List<CreditInteretConstant> getallCredit();

    CreditInteretConstant updateCredit(Long id, CreditInteretConstant credit);

    CreditInteretConstant accepterCredit(Long id);
    CreditInteretConstant refuserCredit(Long id);


}
