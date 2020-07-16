package com.simple.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.simple.command.scoreVO;

//@Service("/scoreDAO")
//@Component
@Repository("scoreDAO")
public class ScoreDAOImpl implements ScoreDAO{

	//DB라고 가정
	private ArrayList<scoreVO> DB = new ArrayList<>();
	
	
	@Override
	public void scoreRegist(scoreVO vo) {
		
		//System.out.println("scroeDAo");
		DB.add(vo);
		System.out.println(DB.toString());
	}


	@Override
	public ArrayList<scoreVO> scoreList() {
		
		return DB;
	}


	@Override
	public void scoreDelete(int num) {
		DB.remove(num);
		
	}
	
	
}
