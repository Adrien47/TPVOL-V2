package formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sopra.promo404.vol.model.Passager;
import sopra.promo404.vol.repositories.IRepositoryPassager;

@Controller
@RequestMapping("/passager")
public class PassagerController {
	
	@Autowired
	private IRepositoryPassager passagerRepo;
	
	@GetMapping(value = { "", "/list" })
	public String list(Model model) {
		List<Passager> passagers = passagerRepo.findAll();

		model.addAttribute("passagers", passagers);

		return "passager/passagers";
	}
	

}
