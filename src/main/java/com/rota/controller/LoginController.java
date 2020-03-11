package com.rota.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rota.dao.LoginDAO;
import com.rota.dao.UserDetailsDAO;
import com.rota.entity.UserVO;
import com.sun.istack.internal.logging.Logger;

@Controller
public class LoginController {

	ModelAndView mv;
	private static Logger logger = Logger.getLogger(LoginController.class);

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
		
		HttpSession session = request.getSession();
		
		LoginDAO loginDao = new LoginDAO();
		UserVO user = new UserVO();
		UserDetailsDAO userDetailsDAO = new UserDetailsDAO();

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		session.getAttribute(username);
		
		//user validation
		user = loginDao.validateUser(username, password);
		logger.info("Logged in user: " + user.getUser());

		if (user.getUser() == null) {
			mv.addObject("ERROR", "Invalid Username / Password.");
			mv.setViewName("index");
			return mv;
		} else {

			//code to display data according to user logged in 
			List<String> userList= new ArrayList<String>();
			userList = userDetailsDAO.getUsersByTeam(user.getTeam());
			
			//get users shift and on-call details
			List<Object> userShiftOncallList = new ArrayList<Object>();
			userShiftOncallList = userDetailsDAO.getShiftByUsers(userList);
			
			//get users task details
			List<Object> taskList = new ArrayList<Object>();
			taskList = userDetailsDAO.getTaskByUsers(userList);

			mv.addObject("userList", userList);
			mv.addObject("userShiftOncallList", userShiftOncallList);
			mv.addObject("taskList", taskList);
			mv.setViewName("calendar");
			return mv;

		}

	}

}