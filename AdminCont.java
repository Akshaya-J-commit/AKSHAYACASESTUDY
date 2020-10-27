package org.hcl.controller;

import org.hcl.entities.Admin;
import org.hcl.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminCont {
	@Autowired
	AdminServices service;
	@GetMapping("/show")
	public String showAdminForm(Model model)
	{
		Admin admin= new Admin();
		model.addAttribute(admin);
		return "adminregister";
	}
	@PostMapping("/process")
	public String processForm(@ModelAttribute("admin") Admin admin, Model model)
	{
		service.insertAdmin(admin);
		model.addAttribute("message","Successfully inserted");
		return "adminregister";
	}

}
