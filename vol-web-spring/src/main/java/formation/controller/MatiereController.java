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
import org.springframework.web.bind.annotation.RequestParam;

import sopra.promo404.formation.model.Difficulte;
import sopra.promo404.formation.model.Matiere;
import sopra.promo404.formation.repository.IRepositoryMatiere;

@Controller
@RequestMapping("/matiere")
public class MatiereController {

	@Autowired
	private IRepositoryMatiere matiereRepo;

	@GetMapping(value = { "", "/list" })
	public String list(Model model) {
		List<Matiere> matieres = matiereRepo.findAll();

		model.addAttribute("mesMatieres", matieres);

		return "matiere/matieres";
	}

	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("maMatiere", new Matiere());

		return "matiere/matiereForm";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		Optional<Matiere> matiere = matiereRepo.findById(id);

		if (matiere.isPresent()) {
			model.addAttribute("maMatiere", matiere.get());
		} else {
			model.addAttribute("maMatiere", new Matiere());
		}

		return "matiere/matiereForm";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("maMatiere")Matiere matiere) {
		matiereRepo.save(matiere);

		return "redirect:list";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		matiereRepo.deleteById(id);

		return "forward:../list";
	}

}
