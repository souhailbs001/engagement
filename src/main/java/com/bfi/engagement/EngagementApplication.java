package com.bfi.engagement;

import com.bfi.engagement.entities.*;
import com.bfi.engagement.repositories.CreditAutoRepository;
import com.bfi.engagement.repositories.RdvRepository;
import com.bfi.engagement.services.CreditInteretConstantService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;
import java.util.Date;

import static com.bfi.engagement.entities.StatutContrat.Being_Processed;

@SpringBootApplication
public class EngagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EngagementApplication.class, args);

	}

	@Bean
	CommandLineRunner start(CreditInteretConstantService creditInteretConstantService, RdvRepository rdvRepository, CreditAutoRepository creditAutoRepository) {
		return args -> {

			Rdv rdv1 = new Rdv(null, new Date() ,LocalTime.now(),LocalTime.now(),"1er rendez-vous", ObjetRdv.Transactions_caisse, StatutRdv.En_attente);
			//Rdv rdv2 = new Rdv(null,"2eme rendez-vous", new Date(), StatutRdv.En_attente,null);
			//Rdv rdv3 = new Rdv(null,"3eme rendez-vous", new Date(), StatutRdv.En_attente,null);
			rdvRepository.save(rdv1);
			//rdvRepository.save(rdv2);
			//rdvRepository.save(rdv3);
			CreditAuto creditAuto1 = new CreditAuto(null,"2018_09101_0000504_A_1_101",10000000,10000000,10000000,0,new Date(), 24);
			creditAutoRepository.save(creditAuto1);

		};
	}


}
