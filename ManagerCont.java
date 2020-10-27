package org.hcl.controller;

import org.hcl.entities.Admin;
import org.hcl.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class ManagerCont {
	@Autowired
	AdminServices service;
	@GetMapping("/show")
	public String showAdminForm(Model model)
	{
		Admin admin= new Admin();
		model.addAttribute(manager);
		return "adminregister";
	}
	@PostMapping("/process")
	public String processForm(@ModelAttribute("manager") Manager manager, Model model)
	{
		service.insertAdmin(manager);
		model.addAttribute("message","Successfully inserted");
		return "managerregister";
	}


}
