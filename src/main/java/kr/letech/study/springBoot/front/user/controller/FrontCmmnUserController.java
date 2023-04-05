package kr.letech.study.springBoot.front.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FrontCmmnUserController {

	@GetMapping("/cmmn/users")
	public String list() {
		return "cmmn/users/list";
	}

	@GetMapping("/cmmn/users/{userId}")
	public String detail(@PathVariable("userId") String userId, Model model) {
		model.addAttribute("userId", userId);
		return "cmmn/users/detail";
	}

	@GetMapping("/cmmn/users/insert")
	public String insert() {
		return "cmmn/users/insert";
	}

	@GetMapping("/cmmn/users/{userId}/modify")
	public String modify(@PathVariable("userId") String userId, Model model) {
		model.addAttribute("userId", userId);
		return "cmmn/users/modify";
	}
}
