package formation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sopra.promo404.formation.model.Civilite;
import sopra.promo404.formation.model.Eleve;
import sopra.promo404.formation.model.Personne;
import sopra.promo404.formation.repository.IRepositoryOrdinateur;
import sopra.promo404.formation.repository.IRepositoryPersonne;

@Controller
@RequestMapping("/eleve")
public class EleveController {

	@Autowired
	private IRepositoryPersonne personneRepo;
	
	@Autowired
	private IRepositoryOrdinateur ordinateurRepo;

	@GetMapping(value = { "", "/list" })
	public String list(Model model) {
		List<Eleve> eleves = personneRepo.findAllEleve();

		model.addAttribute("eleves", eleves);

		return "eleve/eleves";
	}

	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("monEleve", new Eleve());
		model.addAttribute("formateurs", personneRepo.findAllFormateur());
		model.addAttribute("civilites", Civilite.values());
		model.addAttribute("ordinateurs", ordinateurRepo.findAllAvailable());

		return "eleve/eleveForm";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		Optional<Personne> eleve = personneRepo.findById(id);

		if (eleve.isPresent()) {
			model.addAttribute("monEleve", eleve.get());
		} else {
			model.addAttribute("monEleve", new Eleve());
		}
		
		model.addAttribute("formateurs", personneRepo.findAllFormateur());
		model.addAttribute("civilites", Civilite.values());
		model.addAttribute("ordinateurs", ordinateurRepo.findAllAvailableByEleve(id));

		return "eleve/eleveForm";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("monEleve") Eleve eleve) {
		
		
		
		personneRepo.save(eleve);

		return "redirect:list";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		personneRepo.deleteById(id);

		return "forward:../list";
	}

}
