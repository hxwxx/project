package com.project.service;

import java.util.List;

import com.project.domain.BoardVO;

public interface BoardService {
	//게시글 목록
	public List<BoardVO> list() throws Exception;
	//게시글 작성
	public void write(BoardVO vo) throws Exception;
	//게시글 조회
	public BoardVO view(int bno) throws Exception;
	//게시글 수정
	public void modify(BoardVO vo) throws Exception;
	// 게시물 삭제
	public void delete(int bno) throws Exception;
}
