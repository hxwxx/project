package com.project.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.domain.UserVO;
import com.project.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Inject
	UserService service;
	
	@RequestMapping(value = "/list" , method = RequestMethod.GET)
	public void getList(Model model) throws Exception {
		List<UserVO> list = null;
		list = service.list();
		
		model.addAttribute("list",list);
	}
	//회원가입 get
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public void getSignup() throws Exception{
		logger.info("get signup");
	}
	
	//회원 가입 post
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String postSignup(UserVO vo) throws Exception{
		logger.info("post signup");
		
		String pass = BCrypt.hashpw(vo.getPwd(), BCrypt.gensalt());
		vo.setPwd(pass);
		
		service.signup(vo);
		
		return "redirect:/";
	}
	//로그인 get 
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public void getSignin() throws Exception{
		logger.info("get signin");
	}
	//로그인 post
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String postSignin(UserVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
		logger.info("post signin");
		
		UserVO login = service.signin(vo);
		HttpSession session = req.getSession();
		
		String pwd = vo.getPwd();
		String salt = BCrypt.gensalt();
		String hashedPwd = BCrypt.hashpw(pwd, salt);
		
		boolean passMatch = BCrypt.checkpw(pwd,hashedPwd);
		
		if(login != null && passMatch) {
			session.setAttribute("user", login);
		}else {
			session.setAttribute("user", null);
			rttr.addFlashAttribute("msg",false);
			return "redirect:/user/signin";
		}
		return "redirect:/";
	}
	//로그아웃
	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public String signout(HttpSession session) throws Exception{
		logger.info("get logout");
		service.signout(session);
		return"redirect:/";
	}
}
