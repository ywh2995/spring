package com.simple.service;

import java.util.ArrayList;

import com.simple.command.boardVO;

public interface BoardService {

	public void boardRegist(boardVO vo); //board 등록 메서드
	public ArrayList<boardVO> getList(); //모든 게시물 가져오기
	public void boardDelete(int num); //게시글 삭제 메서드
	
	//위 메서드를 구현하는 클래스 BoardServiceImpl을 생성하고 오버라이딩하세요 
}
