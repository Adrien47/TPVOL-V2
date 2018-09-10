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

import sopra.promo404.vol.model.Aeroport;
import sopra.promo404.vol.repositories.IRepositoryAeroport;



@Controller
@RequestMapping("/aeroport")
public class AeroportController {
	@Autowired
	private IRepositoryAeroport aeroportRepo;
	
	
	@GetMapping(value = { "", "/list" })
	public String list(Model model) {
		List<Aeroport> aeroports = aeroportRepo.findAll();

		model.addAttribute("mesAeroports", aeroports);
		

		return "aeroport/aeroports";
	}

	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("monAeroport", new Aeroport());

		return "aeroport/aeroportForm";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		Optional<Aeroport> aeroport = aeroportRepo.findById(id);

		if (aeroport.isPresent()) {
			model.addAttribute("monAeroport", aeroport.get());
		} else {
			model.addAttribute("monAeroport", new Aeroport());
		}

		return "aeroport/aeroportForm";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute("monAeroport")Aeroport aeroport) {
		aeroportRepo.save(aeroport);

		return "redirect:list";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		aeroportRepo.deleteById(id);

		return "forward:../list";
	}
	
}
