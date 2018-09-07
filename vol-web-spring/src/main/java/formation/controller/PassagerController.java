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

import sopra.promo404.vol.model.Passager;
import sopra.promo404.vol.repositories.IRepositoryPassager;
import sopra.promo404.vol.repositories.IRepositoryReservation;

@Controller
@RequestMapping("/passager")
public class PassagerController {
	
	@Autowired
	private IRepositoryPassager passagerRepo;
	
	@Autowired
	private IRepositoryReservation reservationRepo;
	
	@GetMapping(value = { "", "/list" })
	public String list(Model model) {
		List<Passager> passagers = passagerRepo.findAll();

		model.addAttribute("passagers", passagers);

		return "passager/passagers";
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("monPassager", new Passager());
		model.addAttribute("reservations", reservationRepo.findAllAvailable());

		return "passager/passagerForm";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		Optional<Passager> passager = passagerRepo.findById(id);

		if (passager.isPresent()) {
			model.addAttribute("monPassager", passager.get());
		} else {
			model.addAttribute("monPassager", new Passager());
		}

		return "passager/passagerForm";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		passagerRepo.deleteById(id);

		return "redirect:../list";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("monPassager") Passager passager) {
		
		passagerRepo.save(passager);

		return "redirect:list";
	}
	

}
