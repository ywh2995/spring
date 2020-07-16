package com.simple.dao;

import java.util.ArrayList;

import com.simple.command.scoreVO;

public interface ScoreDAO {
	public void scoreRegist(scoreVO vo);//점수 등록 처리 해주는 추상 메서드
	public ArrayList<scoreVO> scoreList();//점수 목록
	public void scoreDelete(int num);//
}
