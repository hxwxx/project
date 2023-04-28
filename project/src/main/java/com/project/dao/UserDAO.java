package com.project.dao;

import java.util.List;

import com.project.domain.UserVO;

public interface UserDAO {
	public List<UserVO> list() throws Exception;
	//회원 가입
	public void signup(UserVO vo) throws Exception;
	//로그인
	public UserVO signin(UserVO vo) throws Exception;
}
