package com.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.dao.BoardDAO;
import com.project.domain.BoardVO;
@Service
public class BoardServiceImpl implements BoardService{
	@Inject
	private BoardDAO dao;
	
	//게시글 목록
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}
	//게시글 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);
	}
	//게시글 조회
	@Override
	public BoardVO view(int bno) throws Exception {
		return dao.view(bno);
	}
	//게시글 수정
	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.modify(vo);
	}
	// 게시물 삭제
	@Override
	public void delete(int bno) throws Exception {
	 dao.delete(bno);
	}

}
