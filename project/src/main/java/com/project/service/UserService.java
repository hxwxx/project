package com.project.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.project.domain.UserVO;

public interface UserService {
	//회원 목록 - 관리자
	public List<UserVO> list() throws Exception;
	//회원 가입
	public void signup(UserVO vo) throws Exception;
	//로그인
	public UserVO signin(UserVO vo) throws Exception;
	//로그아웃
	public void signout (HttpSession session) throws Exception;
}
