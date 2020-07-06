package com.simple.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;

@Service("scoreService")//컴포넌트 스캔이 읽어서 scoreService이름으로 빈 생성
public class ScoreServiceImpl implements ScoreService{

	@Resource(name="scoreDAO")
	private ScoreDAO scoreDao;
	
	@Override
	public void scoreRegist(ScoreVO vo) {

		scoreDao.scoreRegist(vo);
		
	}

	@Override
	public ArrayList<ScoreVO> scoreList() {
		
		ArrayList<ScoreVO> list = scoreDao.scoreList();
		
		return list;
	}

	@Override
	public void scoreDelete(int num) {
		
		scoreDao.scoreDelete(num);
	}

	
}
