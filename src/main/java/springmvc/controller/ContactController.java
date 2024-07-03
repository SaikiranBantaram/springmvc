package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commanDataForModel(Model model) {
		model.addAttribute("Header", "LearnCode with Durgesh");
		model.addAttribute("Desc", "Home for programmer");
		System.out.println("adding common data for model");
	}

	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute User user,Model model) {
		if(user.getUserName().isEmpty()) {
			return "redirect:/contact";
		}
		userService.save(user);
		System.out.println("inside controller");
		model.addAttribute("msg", "User is created with id " + user.getId());
		return "success";
	}
}
/*
@RequestMapping(path = "/processForm", method = RequestMethod.POST)
public String processForm(
		@RequestParam("email") String email,
		@RequestParam("userName") String userName,
		@RequestParam("password") String password,Model model) {
	model.addAttribute("email", email);
	model.addAttribute("userName", userName);
	model.addAttribute("password", password);
	return "success";
}*/