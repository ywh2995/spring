package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.command.Quiz01VO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	//문제 1번
	
	//화면처리
	@RequestMapping("/quiz01")
	public String quiz01() {
		return "quiz/quiz01";
	}
	
	@RequestMapping("sendBirth")
	public String sendBirth(Quiz01VO vo, Model model) {
		System.out.println(vo.getYear());
		System.out.println(vo.getMonth());
		System.out.println(vo.getDay());
	
		model.addAttribute("vo", vo);
		return "quiz/quiz01_ok";
	}
	
	//문제 2번
	
	
}
