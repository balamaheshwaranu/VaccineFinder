package com.helper.vaccine.vaccinefinder.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.helper.vaccine.vaccinefinder.rest.CenterDetails;
import com.helper.vaccine.vaccinefinder.rest.CenterList;

@Service
public class VaccineFinderService {
	
	private static final String BASE = "https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByPin";

	
	
	//?pincode=560035&date=21-06-2021
		
	
	private RestTemplate restTemplate;
	
	@Autowired
	public VaccineFinderService(RestTemplateBuilder builder) {
		
		restTemplate = builder.build();
	}
			
	public List<CenterDetails> getData(String pincode, String date) throws UnsupportedEncodingException	{
		

		CenterList response = restTemplate.getForObject(
				String.format("%s?pincode=%s&date=%s",BASE,pincode,date), CenterList.class);
		
		return response.getSessions();
		
	}
}
