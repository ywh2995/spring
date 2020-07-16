package com.simple.mapper;

import java.util.ArrayList;

import com.simple.command.BoardVO;

public interface BoardMapper {

	public int boardRegist(BoardVO vo);
	public ArrayList<BoardVO> boardList();
	public void boardDelete(int num);
}
