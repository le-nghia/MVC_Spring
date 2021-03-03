package org.o7planning.hellospringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Logout {
	@RequestMapping("/Logout")
	public ModelAndView KtLogout(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session) 
	{
		try {
			session =request.getSession(false);
			session.removeAttribute("un");
			response.sendRedirect("hello");
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
