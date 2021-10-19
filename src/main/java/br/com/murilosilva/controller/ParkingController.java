package br.com.murilosilva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.murilosilva.model.Parking;
import br.com.murilosilva.service.ParkingService;

@Controller
@RequestMapping("/parking")
public class ParkingController {
	@Autowired
	private ParkingService parkingService;
	
	@GetMapping("/list")
	public String list (Model model) {
		List<Parking> parking = parkingService.findAll();
		model.addAttribute("parking",parking);
		return "parking/list";
	}
	@GetMapping("/forminsert")
	
	public String insert(Model model) {
		Parking parking = new Parking();
		model.addAttribute("parking", parking);
		return "book/insert";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute("parking")Parking parking) {Parking resultParking = parkingService.insert(parking);
	if(resultParking != null) {
		return "parking/sucess";
	}
	return "parking/error";
		
	}
}
