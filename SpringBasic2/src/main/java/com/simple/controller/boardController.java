package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.command.boardVO;

@Controller
@RequestMapping("/service")
public class boardController {
	
	@Autowired
	
	//화면 처리
	@RequestMapping("/boardRegister")
	public void boardRegister() {
		
	}
	
	@RequestMapping("/boardForm")
	public String boardRegister(boardVO vo) {
		
		return "service/boardResult";
	}
}
