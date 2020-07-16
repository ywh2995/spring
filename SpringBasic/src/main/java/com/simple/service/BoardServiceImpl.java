package com.simple.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;
import com.simple.mapper.BoardMapper;

@Service("boardService")
public class BoardServiceImpl implements BoardService{


//	@Autowired
//	private BoardDAO boardDAO;
//	
//	@Override
//	public void boardRegist(BoardVO vo) {
//		
//	}
//
//	@Override
//	public ArrayList<BoardVO> getList() {
//		
//		return null;
//	}
//
//	@Override
//	public void boardDelete(int num) {
//		
//	}
	
	/*
	 * 1. board관련 mybatis 인터페이스 선언, 구현체를 생성
	 * 2. xml파일에서는 아이디를 이용해서 매퍼태그를 생성.
	 * 3. 서비스영역에서 매퍼 주입하고, 추상메서드를 실행.
	 */

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void boardRegist(BoardVO vo) {
//		int result = boardMapper.boardRegist(vo);
//		System.out.println("성공실패:" + result);
		
		//1st
		//boardMapper.boardTegist(vo);
		
		//2nd
		HashMap<String, String> map = new HashMap<>();
		map.put("name", vo.getName());
		map.put("title", vo.getName());
		map.put("content", vo.getName());
	}
	
	@Override
	public ArrayList<BoardVO> getList() {
		ArrayList<BoardVO> list = boardMapper.boardList();
		return list;
	}
	
	@Override
	public void boardDelete(int num) {
		boardMapper.boardDelete(num);
		
	}
	
}
