package com.project.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.domain.UserVO;
@Repository
public class UserDAOImpl implements UserDAO{
	@Inject
	private SqlSession sql;
	//매퍼
	private static String namespace = "com.project.mappers.user";
	//회원 목록 - 관리자
	@Override
	public List<UserVO> list() throws Exception {
		return sql.selectList(namespace + ".list");
	}
	//회원 가입
	@Override
	public void signup(UserVO vo) throws Exception {
		sql.insert(namespace + ".signup", vo);
	}
	@Override
	public UserVO signin(UserVO vo) throws Exception {
		return sql.selectOne(namespace + ".signin", vo);
	}

}
