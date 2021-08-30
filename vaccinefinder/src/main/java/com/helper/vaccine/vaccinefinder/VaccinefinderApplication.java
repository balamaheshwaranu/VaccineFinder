package com.helper.vaccine.vaccinefinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This application will show the results of vaccination centre available by providing pin code
// Thanks to COWIN API
// For self use and learning

@SpringBootApplication
public class VaccinefinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccinefinderApplication.class, args);
	}

}
