package formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sopra.promo404.vol.model.Aeroville;
import sopra.promo404.vol.repositories.IRepositoryAeroport;
import sopra.promo404.vol.repositories.IRepositoryAeroville;
import sopra.promo404.vol.repositories.IRepositoryVille;

@Controller
@RequestMapping("/aeroville")
public class AerovilleController {
	
	@Autowired
	private IRepositoryAeroville aerovilleRepo;
	
	@Autowired
	private IRepositoryAeroport aeroportRepo;
	
	@Autowired
	private IRepositoryVille villeRepo;
	
	@GetMapping(value = { "", "/list" })
	public String list(Model model) {
		List<Aeroville> aerovilles = aerovilleRepo.findAll();

		model.addAttribute("aerovilles", aerovilles);

		return "aeroville/aerovilles";
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("monAeroville", new Aeroville());
		model.addAttribute("aeroports", aeroportRepo.findAll());
		model.addAttribute("villes", villeRepo.findAll());

		return "aeroville/aerovilleForm";
	}
	
//	@GetMapping("/edit/{id}")
//	public String edit(@PathVariable Long id, Model model) {
//		Optional<Aeroville> aeroville = aerovilleRepo.findById(id);
//
//		if (aeroville.isPresent()) {
//			model.addAttribute("monAeroville", aeroville.get());
//		} else {
//			model.addAttribute("monAeroville", new Aeroville());
//		}
//
//		model.addAttribute("aeroports", aeroportRepo.findAll());
//		model.addAttribute("villes", villeRepo.findAll());
//		return "aeroville/aerovilleForm";
//	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		aerovilleRepo.deleteById(id);

		return "redirect:../list";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("monAeroville") Aeroville aeroville) {
		
		aerovilleRepo.save(aeroville);

		return "redirect:list";
	}
	

}
