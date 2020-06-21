package it.dstech.formazione.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.formazione.model.Allenatore;
import it.dstech.formazione.model.Digimon;
import it.dstech.formazione.service.AllenatoreService;
import it.dstech.formazione.service.DigimonService;

@Controller
public class DigimonController {
	

	@Autowired
	private DigimonService digimonService;
	@Autowired
	private AllenatoreService allenatoreService;
	/*
	@RequestMapping("/")
	public ModelAndView home() {
		List<Digimon> listDigimon = digimonService.listAll();
		//List<Allenatore> listAllenatore = allenatoreService.listAll();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listDigimon", listDigimon);
	//	mav.addObject("listAllenatore", listAllenatore);
		return mav;
	}
	*/
	@RequestMapping("/")
	public ModelAndView home() {
		//List<Digimon> listDigimon = digimonService.listAll();
		//List<Allenatore> listAllenatore = allenatoreService.listAll();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listDigimon", digimonService.listAll());
	    mav.addObject("listAllenatore", allenatoreService.listAll());
		return mav;
	}

	
	
	@RequestMapping("/new")
	public String newDigimonForm(Map<String, Object> model) {
		Digimon digimon = new Digimon();
		model.put("digimon", digimon);
		return "new_digimon";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveDigimon(@ModelAttribute("digimon") Digimon digimon) {
		digimonService.save(digimon);
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editDigimonForm(@RequestParam int id) {
		ModelAndView mav = new ModelAndView("edit_digimon");
		Digimon digimon = digimonService.get(id);
		mav.addObject("digimon", digimon);
		
		return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteDigimonForm(@RequestParam int id) {
		digimonService.delete(id);
		return "redirect:/";		
	}
	 // aggiunta pe allenatore
	@RequestMapping("/newAllenatore")
	public String newAllenatoreForm(Map<String, Object> model) {
		Allenatore allenatore = new Allenatore();
		model.put("allenatore", allenatore);
		return "new_allenatore";
	}
	
	
	
	@RequestMapping(value = "/saveAllenatore", method = RequestMethod.POST)
	public String saveAllenatore(@ModelAttribute("allenatore") Allenatore allenatore) {
		allenatoreService.save(allenatore);
		return "redirect:/";
	}
	
	@RequestMapping("/editAllenatore")
	public ModelAndView editAllenatoreForm(@RequestParam int id) {
		ModelAndView mav = new ModelAndView("edit_allenatore");
		Allenatore allenatore = allenatoreService.get(id);
		mav.addObject("allenatore", allenatore);
		
		return mav;
	}
	
	@RequestMapping("/deleteAllenatore")
	public String deleteAllenatoreForm(@RequestParam int id) {
		allenatoreService.delete(id);
		return "redirect:/";		
	}
	
	/*
	@RequestMapping("/addDigimon")
	public String addDigimonForm(@RequestParam int id, Map<String, Object> model) {
		Allenatore allenatore = allenatoreService.get(id);
		List<Digimon> listaDigimon = digimonService.listAll();
		
		//model.put("allenatore", allenatore);
		model.put("digimon", listaDigimon);
		
		return "scegliDigimon";
	}
	*/

	@RequestMapping("/addDigimon")
	public ModelAndView assegnaDigimonForm(@RequestParam int id) { //@ModelAttribute("digimon") Digimon digimon
		ModelAndView model = new ModelAndView("scegliDigimon");
		List<Digimon> listaDigimon = digimonService.listAll();
		System.out.println("Lista digimon "+listaDigimon );
		System.out.println("Id allenatore "+id);
		model.addObject("idAllenatore", id);
		model.addObject("listaDigimon", listaDigimon);
	 

		return model;
	}
	


	
	
	
}
