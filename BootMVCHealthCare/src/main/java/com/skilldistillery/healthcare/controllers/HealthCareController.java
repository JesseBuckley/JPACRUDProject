package com.skilldistillery.healthcare.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.healthcare.controllers.data.HealthCareDAO;
import com.skilldistillery.healthcare.entities.HealthCare;

@Controller
public class HealthCareController {

	@Autowired
	private HealthCareDAO healthDAO;

	@GetMapping(path = { "", "/", "home.do" })
	public String index(Model model) {
		return "home";
	}

	@GetMapping(path = "healthCareDetails.do")
	public ModelAndView showHealthCareDetails(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView();

		HealthCare health = healthDAO.findById(id);
		if (health != null) {
			mv.addObject("healthCare", health);
			mv.setViewName("healthCareDetails");
		}
		return mv;
	}

	@RequestMapping(path = "updateHealthCare.do", method = RequestMethod.GET)
	public String editHealthCareForm(@RequestParam("id") int id, Model model) {
		HealthCare healthCare = healthDAO.findById(id);

		model.addAttribute("healthCare", healthCare);

		return "updateHealthCare";
	}

	@PostMapping("/update")
	public String updateHealthCare(@RequestParam("id") int id, @ModelAttribute HealthCare updateHealthCare) {
		System.out.println("*********************entering update method*************************");
		HealthCare existingHealthCare = healthDAO.findById(id);

		existingHealthCare.setPatientName(updateHealthCare.getPatientName());
		existingHealthCare.setMedicalRecords(updateHealthCare.getMedicalRecords());
		existingHealthCare.setHealthcareProviders(updateHealthCare.getHealthcareProviders());
		existingHealthCare.setAppointments(updateHealthCare.getAppointments());
		existingHealthCare.setPrescriptions(updateHealthCare.getPrescriptions());

		healthDAO.updateHealthCare(existingHealthCare);

		return "redirect:/healthCareDetails.do?id=" + id;
	}

	@RequestMapping(path = "deleteHealthCare.do", method = RequestMethod.GET)
	public ModelAndView deleteHealthCare(@RequestParam("id") int id) {

		HealthCare healthToDelete = healthDAO.findById(id);

		Boolean deleteMessage = healthDAO.deleteHealthCare(healthToDelete);

		ModelAndView mv = new ModelAndView();

		mv.addObject("errorMessage", deleteMessage);
		mv.setViewName("error");
		return mv;

	}

	@RequestMapping(path = "addHealthCare.do", method = RequestMethod.GET)
	public ModelAndView navigateToAddFilmPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addHealthCare");
		return mv;
	}
}
