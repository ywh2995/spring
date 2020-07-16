package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	//경로 설정
	@RequestMapping("/")
	public String home () {

		//결과 화면 //디스패커 서블릿에 날려줌 여긴
		return "home";
	}
}
