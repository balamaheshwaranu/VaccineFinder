package com.helper.vaccine.vaccinefinder.controller;


import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.helper.vaccine.vaccinefinder.service.VaccineFinderService;

@Controller
public class vaccineController {

	@Autowired
	private VaccineFinderService vaccinefinderService;
	
	@GetMapping("/result")
	public String getResult(@RequestParam(required= false) String Pincode,@RequestParam(required= false) String finddate,Model model) throws UnsupportedEncodingException {
		
		String[] parts = finddate.split("-");
		
		 model.addAttribute("centers", vaccinefinderService.getData(Pincode, parts[2]+"-"+parts[1]+"-"+parts[0]));
		
		 model.addAttribute("pincode",Pincode);
		 model.addAttribute("date",parts[2]+"-"+parts[1]+"-"+parts[0]);
		//model.addAttribute("user",geocoder.getLatLng("1600 Ampitheatre Parkway","Mountain View","CA"));
		return "result";
	}	
	
}
