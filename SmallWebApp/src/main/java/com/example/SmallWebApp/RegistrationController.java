package com.example.SmallWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

	@RequestMapping("/regform")
	public String register() {
		return "registration";
	}
	
	@RequestMapping("/userDetail")
	public ModelAndView userInfo(UserRegistration reg) {
		System.out.println("loaging...."+reg.getUName());
		
		ModelMap model=new ModelMap();
		model.addAttribute("name", reg.getUName());
		model.addAttribute("email", reg.getEmailId());
		model.addAttribute("phone",reg.getPhone());
		
		ModelAndView mv=new ModelAndView("user-details");
		mv.addObject("regObj",model);
		return mv;
	}
	
//	@RequestMapping("/userDetail")
//	public String userInfo(UserRegistration reg) {
//		return "operation";
//	}
	
	
	@RequestMapping("/register")
	public String newUser() {
		return "signup";
	}
	
	@RequestMapping("/login")
	public String loginUser() {
		return "login";
	}
	
	@RequestMapping("/loginNow")
	public ModelAndView loginCurrent(UserLogin logi) {
		System.out.println("loaging...."+logi.getUEmail());
		
		ModelMap model=new ModelMap();
		model.addAttribute("name", logi.getUEmail());
		model.addAttribute("email", logi.getPassword());
		
		ModelAndView mv=new ModelAndView("user-details");
		mv.addObject("regObj",model);
		return mv;
	}
}
