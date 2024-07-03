package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("home controller");
		model.addAttribute("name","SaikiranReddy");
		model.addAttribute("id",133);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Kiran");
		friends.add("Rajesh");
		friends.add("Sandeep");
		model.addAttribute("friends",friends);
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		//creating Model And View object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting data 
		modelAndView.addObject("name", "SaikiranReddy");
		modelAndView.addObject("empId", 133);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(190);
		marks.add(500);
		marks.add(550);
		marks.add(900);
		marks.add(1200);
		modelAndView.addObject("marks", marks);
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
