package com.simple.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.scoreVO;
import com.simple.dao.ScoreDAO;

@Service("scoreService") //3번째 방법 컴포넌트 스캔이 읽어서 scoreService 이름으로 빈으로 생성  
public class ScoreServiceImpl implements ScoreService {
	
	//@Autowired
	@Resource(name="scoreDAO")
	private ScoreDAO scoreDAO;
	
	@Override
	public void scoreRegist(scoreVO vo) {
		//System.out.println("here...");
		scoreDAO.scoreRegist(vo);
	}

	@Override
	public ArrayList<scoreVO> ScoreList() {
		//ArrayList<scoreVO>list = scoreDAO.scoreList();
		//return list;
		return scoreDAO.scoreList();
	}

	@Override
	public void scoreDelete(int num) {
	
		scoreDAO.scoreDelete(num);
		
		
	}

	
}
