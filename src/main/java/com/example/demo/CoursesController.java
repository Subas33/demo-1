package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
	
	@RequestMapping("courses")
//	@ResponseBody
	public ModelAndView courses(@RequestParam("cname") String coursename)
	{
//		HttpSession session = req.getSession();s
//		System.out.println("Web App is Running in port 8083");
//		String cname = req.getParameter("cname");
//		session.setAttribute("cname", coursename);	
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname",coursename);
		mv.setViewName("courses");
		return mv;
	}
}
