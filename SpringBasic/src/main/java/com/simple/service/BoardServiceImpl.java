package com.simple.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.simple.command.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Override
	public void boardRegist(BoardVO vo) {
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		
		return null;
	}

	@Override
	public void boardDelete(int num) {
		
	}

	
}
