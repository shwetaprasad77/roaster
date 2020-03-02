package com.rota.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rota.dao.ConstantDAO;
import com.rota.dao.LoginDAO;
import com.rota.dao.ResourceDAO;
import com.rota.entity.ConstantVO;
import com.rota.entity.ResourceVO;

@Controller
public class LoginController {

	ModelAndView mv;

	@RequestMapping("/")
	public ModelAndView first(HttpServletRequest request, HttpServletResponse response) throws Exception {

		mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {

		mv = new ModelAndView();

		LoginDAO loginDao = new LoginDAO();
		ResourceVO resource = new ResourceVO();
		ResourceDAO resourceDAO = new ResourceDAO();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		//user validation
		resource = loginDao.validateUser(username, password);
		//System.out.println(resource.getResourceId());

		if (resource.getResourceId() == 0) {
			mv.addObject("ERROR", "Invalid Username / Password.");
			mv.setViewName("index");
			return mv;
		} else {

			//code to fetch member details
			List<ResourceVO> memberList= new ArrayList<ResourceVO>();
			memberList = resourceDAO.fetchMember(username);
			
			//List<ConstantVO> keyList = new ArrayList<ConstantVO>();
			List<ConstantVO> constantList = new ArrayList<ConstantVO>();
			ConstantDAO constantDAO = new ConstantDAO();
			
			//fetch key and constant list
			//keyList = constantDAO.fetchKeyList();
			constantList = constantDAO.fetchConstantList();

			//code to fetch key and constant
			mv.addObject("resList", resource);
			mv.addObject("memberList", memberList);
			mv.addObject("username", resource.getName());
			mv.setViewName("calendar");
			return mv;

		}

	}

}