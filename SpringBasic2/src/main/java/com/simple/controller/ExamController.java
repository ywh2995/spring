package com.simple.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.command.ReqVO;

public class ExamController {
	@RequestMapping("/login")
	public String login(ReqVO vo ) {
	
		
		if(vo.getId().equals("abc123") && vo.getPw().equals("xxx123")) {
		
		return "request/req_ex02_result";
		}else {
			return "request/req_ex02_fail";
		}
		
	}
}
