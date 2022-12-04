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
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class EngagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EngagementApplication.class, args);

	}

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Jwt-Token", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials", "File-Name"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
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
