package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class MainController {
	@Autowired
	 private Semester_1Repository semester_1Repo;
	@Autowired
	 private Semester_2Repository semester_2Repo;
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/student1")
	public String showRegistrationForm(Model model) {
	  model.addAttribute("semester_1", new Semester_1());	
	return "student1";
	}
	@PostMapping("/student2")
	public String showindex(Semester_1 semester_1) {
		  semester_1Repo.save(semester_1);
		return "student2";
	}
	@GetMapping("/student2")
	public String student2(Model model) {
	  model.addAttribute("semester_2", new Semester_2());	
	return "student2";
}
	@PostMapping("/finish")
	public String finish(Semester_2 semester_2) {
		  semester_2Repo.save(semester_2);
		return "finish";
}
}
