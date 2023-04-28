package com.project.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.project.dao.UserDAO;
import com.project.domain.UserVO;

@Service
public class UserServiceImpl implements UserService{
	@Inject
	private UserDAO dao;
	//회원 목록 - 관리자
	@Override
	public List<UserVO> list() throws Exception {
		return dao.list();
	}
	//회원가입
	@Override
	public void signup(UserVO vo) throws Exception {
		dao.signup(vo);
	}
	@Override
	public UserVO signin(UserVO vo) throws Exception {
		return dao.signin(vo);
	}
	@Override
	public void signout(HttpSession session) throws Exception {
		session.invalidate();
	}

}
