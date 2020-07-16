package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz01VO;
import com.simple.command.Quiz02VO;

@Controller
@RequestMapping("/quiz")

public class QuizController {

	@RequestMapping("/quiz01")
	public String quiz01() {

		return "quiz/quiz01";
	}

	@RequestMapping("/quiz02")
	public String quiz02() {
		return "quiz/quiz02";
	}


	@RequestMapping("/quiz03")
	public String quiz03() {
		return "quiz/quiz03";
	}


	//		@RequestMapping("/quiz01", "/quiz02", "/quiz03")
	//		public void view() {
	//			
	//		}
	//		

	//-------quiz1-------
	@RequestMapping("/sendBirth")
	public String sendBirth (@ModelAttribute("info") Quiz01VO vo) {
		System.out.println("sendBirth");
		System.out.println(vo.getYear());
		System.out.println(vo.getMonth());
		System.out.println(vo.getDay());

		return "quiz/Quiz01_ok";


	}
	//-------quiz2-------
	@RequestMapping("/join")
	public String join(@ModelAttribute("info") Quiz02VO vo) {
		return "quiz/Quiz02_ok";
	}

	//-------quiz3-------

	@RequestMapping("/join2")
	public String join(
			@RequestParam("id") String id,
			@RequestParam("pw") String pw,
			@RequestParam("pw_check") String check,
			RedirectAttributes RA,
			Model model
			) {

		if(id.equals("")) {
			RA.addFlashAttribute("msg", "아이디를 확인하세요");
			return "redirect:/quiz/quiz03";//다시 컨트롤러를 태운다~
		}else if(pw.equals(check)) {
			RA.addFlashAttribute("msg", "비밀번호를 확인하세요 ");
			return "redirect:/quiz/quiz03";
		}else {
			model.addAttribute("id", id);
			
			return "quiz/quiz03_ok";
		}


	}



}

