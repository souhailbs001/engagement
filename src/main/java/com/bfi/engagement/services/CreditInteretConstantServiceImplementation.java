package com.bfi.engagement.services;

import com.bfi.engagement.entities.AmortissementConstant;
import com.bfi.engagement.entities.CreditInteretConstant;
import com.bfi.engagement.repositories.AmortissementConstantRepository;
import com.bfi.engagement.repositories.CreditInteretConstantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


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
        creditInteretConstantRepository.save(creditInteretConstant);
        return creditInteretConstant;



       /* double amortissement = creditInteretConstant.getEmprunt()/creditInteretConstant.getDuree();
        double crd = creditInteretConstant.getEmprunt() - amortissement;
        double valeurInteret = creditInteretConstant.getEmprunt() * (creditInteretConstant.getTauxInteret()/100);
        double Annuites = amortissement * creditInteretConstant.getTauxInteret();*/


      //  return new AmortissementConstant()
        //return new CreditInteretConstant(creditInteretConstant.getEmprunt(), creditInteretConstant.getTauxInteret(),
        //       creditInteretConstant.getDuree(),valeurInteret,Annuites,amortissement,crd,creditInteretConstant.getStatut(),null);

        /*double capitalRestantDu = creditInteretConstant.getNetComercial();
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
        return CreditInteretConstant;*/
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
