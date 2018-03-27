/*package com.defensoria.proyecto1.controlador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

	@GetMapping("/")
	public String redirectToLogin() {
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model model,
		@RequestParam(name="error",required=false) String error,
		@RequestParam(name="logout",required=false) String 	logout,HttpServletRequest request,HttpServletResponse response)	{
			model.addAttribute("error",error);
			model.addAttribute("logout",logout);
			HttpSession sesion = request.getSession();//	request.getSession(false);
			//sesion.invalidate();
			return "/login";
				
	}
	
	@GetMapping({"/loginsuccess","/"})
	public String showLoginForm() {
		return "Administrador/index"; //"redirect:Administrador/index";
	}
}
*/