package formation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(@RequestParam(required=false) String nom, Model model) {
		
		model.addAttribute("monNom", nom);
		
		return "home";
	}

}
