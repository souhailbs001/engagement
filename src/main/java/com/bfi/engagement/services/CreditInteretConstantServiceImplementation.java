package com.bfi.engagement.services;

import com.bfi.engagement.entities.*;
import com.bfi.engagement.repositories.AmortissementConstantRepository;
import com.bfi.engagement.repositories.CreditInteretConstantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CreditInteretConstantServiceImplementation  implements  CreditInteretConstantService{

    @Autowired
    private AmortissementConstantRepository amortissementConstantRepository;
    @Autowired
    private CreditInteretConstantRepository creditInteretConstantRepository;

    @Override
    public CreditInteretConstant getTableauArmotissement(CreditInteretConstant creditInteretConstant) {
        ArrayList<AmortissementConstant> amortissementConstants = new ArrayList<AmortissementConstant>();
        double crd = creditInteretConstant.getEmprunt();
        for(int i=1;i<=creditInteretConstant.getDuree();i++){
            AmortissementConstant amortissementConstant= new AmortissementConstant();
            amortissementConstant.setAmortissement(creditInteretConstant.getEmprunt() / creditInteretConstant.getDuree());
                double valeurInteret = crd * (creditInteretConstant.getTauxInteret() / 100);
                amortissementConstant.setValeurInteret(valeurInteret);
                double annuites = amortissementConstant.getAmortissement() + valeurInteret;
                amortissementConstant.setAnnuites(annuites);
                amortissementConstant.setAnnee(i);
                amortissementConstant.setCrd(crd);
                amortissementConstants.add(amortissementConstant);
                crd = crd-amortissementConstant.getAmortissement();
            }
        creditInteretConstant.setAmortissementConstants(amortissementConstants);
        creditInteretConstant.setStatut(StatutDemande.Being_Processed);
        creditInteretConstantRepository.save(creditInteretConstant);
        return creditInteretConstant;
    }

    @Override
    public CreditInteretConstant saveDemandeCredit(CreditInteretConstant creditInteretConstant) {
        creditInteretConstant.setStatut(StatutDemande.Being_Processed);
        return this.creditInteretConstantRepository.save(creditInteretConstant);
    }


    @Override
    public List<CreditInteretConstant> getallCredit() {
        return this.creditInteretConstantRepository.findAll();
    }

    @Override
    public CreditInteretConstant updateCredit(Long id, CreditInteretConstant credit) {
        credit.setId(id);
        return creditInteretConstantRepository.save(credit);
    }

    @Override
    public CreditInteretConstant accepterCredit(Long id) {
        CreditInteretConstant credit =creditInteretConstantRepository.getById(id);
        credit.setStatut(StatutDemande.Validated);
        return this.updateCredit(credit.getId(),credit);
    }

    @Override
    public CreditInteretConstant refuserCredit(Long id) {
        CreditInteretConstant credit =creditInteretConstantRepository.getById(id);
        credit.setStatut(StatutDemande.Refused);
        return this.updateCredit(credit.getId(),credit);
    }
   /* @Override
    public CreditInteretConstant getTableauAmortissement(CreditInteretConstant creditInteretConstant) {
            double capitalRestantDu = creditInteretConstant.getNetComercial();
            double echeanceAnnuel = creditInteretConstant.getNetComercial()/creditInteretConstant.getDuree();
            double annuites = 0;
            double valeurInteret = 0;
            double[] tableauAnnuites = new double[50];
            double tauxInteretPourcentage = creditInteretConstant.getTauxInteret();
            tauxInteretPourcentage = tauxInteretPourcentage/100;

            for (int i=0; i<creditInteretConstant.getDuree(); i++){
                valeurInteret = capitalRestantDu * tauxInteretPourcentage;
                System.out.println("valeurInteret :" + valeurInteret);
                annuites = echeanceAnnuel + valeurInteret;
                System.out.println("echeanceAnnuel :" + echeanceAnnuel);
                tableauAnnuites[i]= annuites;
                System.out.println(annuites);
                capitalRestantDu = capitalRestantDu - echeanceAnnuel;
            }
        System.out.println(tableauAnnuites);
            return CreditInteretConstant;
    }*/




}
