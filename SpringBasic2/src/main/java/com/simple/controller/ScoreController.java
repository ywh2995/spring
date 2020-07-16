package com.simple.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.scoreVO;
import com.simple.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class ScoreController {
	
//	서비스 계층 구현 방법 3가지 
	//1st 전역 변수로 빼줄수 있음 
	//ScoreServiceImpl service = new ScoreServiceImpl();
	
	//2nd 
	//@Resource(name="socoreService")//이름으로 찾는것을 @Resource
//	@Autowired
//	private ScoreServiceImpl scoreService;
	
	//3rd
	//
	// ScoreServiceImpl 에서  @Service("scoreService") 
	//3번째 방법 컴포넌트 스캔이 읽어서 scoreService 이름으로 빈으로 생성후 자동 주입 명령
	@Autowired
	private ScoreServiceImpl scoreService;
	
	//화면 처리
	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		return "/service/scoreRegist";
	}
	//점수등록 요청
	@RequestMapping("/scoreForm")
	public String scoreForm(scoreVO vo) {
		//처리...
		scoreService.scoreRegist(vo);
		return "service/scoreResult";
	}
	
	//점수 화면 요청
	// ->ScoreServiceImpl -> ScoreDAOImpl  ->    
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {
		
		ArrayList<scoreVO> list = scoreService.ScoreList();
		
		model.addAttribute("list",list);//화면에 모델 전달
		
		return "score/scoreList";
	}
	
	//점수 삭제 요청
	@RequestMapping("/scoreDelete")
	public String scoreDelete(@RequestParam("num") int num,
						RedirectAttributes RA
			) {
		scoreService.scoreDelete(num);
		RA.addFlashAttribute("num",num);
		return "redirect:/service/scoreList";
	}
}
