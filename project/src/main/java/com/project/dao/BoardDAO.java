package com.project.dao;

import java.util.List;

import com.project.domain.BoardVO;

public interface BoardDAO {
	//게시글 목록
	public List<BoardVO> list() throws Exception;
	//게시글 작성
	public void write(BoardVO vo) throws Exception;
	//게시글 조회
	public BoardVO view(int bno) throws Exception;
	//게시글 수정
	public void modify(BoardVO vo) throws Exception;
	// 게시뮬 삭제
	public void delete(int bno) throws Exception;
}
