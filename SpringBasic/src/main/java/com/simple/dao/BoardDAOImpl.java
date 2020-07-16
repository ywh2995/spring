package com.simple.dao;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;

@Repository("BoardDAOImpl")
public class BoardDAOImpl implements BoardDAO{

	
	private List<BoardVO> DB = new ArrayList<>();
	
	@Override
	public void boardRegist(BoardVO vo) {
		
		DB.add(vo);
		System.out.println("DB저장 성공");
	}

	@Override
	public List<BoardVO> getList() {
		System.out.println("DB호출");
		return DB;
	}

	@Override
	public void boardDelete(int num) {
		
		DB.remove(num);
		System.out.println(num+"번째 DB 삭제 성공");
		
	}

}
