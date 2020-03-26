package io.javabrains.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.javabrains.models.LocationStats;
import io.javabrains.services.CoronavirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	CoronavirusDataService coronaVirusDataService;
	
	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats = coronaVirusDataService.getAllStats();
		int sum = allStats.parallelStream().mapToInt(stat -> stat.getActive()).sum();
		int newCases = allStats.parallelStream().mapToInt(stat -> stat.getDeaths()).sum();
		model.addAttribute("totalReportedCases", sum);
		model.addAttribute("totaldeaths", newCases);
		model.addAttribute("locationStats", coronaVirusDataService.getAllStats());
		return "home";
	}
}
