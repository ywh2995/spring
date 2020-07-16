package com.simple.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;

@Controller //component스켄이 해당 어노테이션을 읽어서 빈으로 생성 
@RequestMapping("/request") //이게 있으면 아래 에 모드 / request를 넣어준다 그래서 @RequestMapping("/request/req_ex01") -> @RequestMapping("/req_ex01") 변경
public class RequestController {
	//모든 요청은 컨트롤러를 통해서 들어오게 되는데, 이 매서드를 실행시키고 싶으면  /request/req_ex01 요청을 화면에 호출하면됨.
	//폴더 명을 맞춰서 요청결로를 기술하는 편이 좋습니다.
	//void형이라면 호출된 URL과 동일한 페이지로 연결
	
	//req_ex01화면 요청
//	@RequestMapping("/req_ex01")
//	public void req_ex01("request/req_ex01") {
//		
//	}
	@RequestMapping("/req_ex01")
	public String req_ex01() {
	
		//이아이는 viewresolver로 가는 아이 
		return "request/req_ex01";
	}
	
	//basic요청 정리   1,2, 클래스 메서드 다 사용 가능 그러니 연습은 이거 먼저 
	@RequestMapping(value="/basic1", method= RequestMethod.GET) // <-get요청만 받는다라는 뜻 
	public void basic() {
		System.out.println("bacis화면 요청");
	}
	//badic2요청 정리
	@RequestMapping(value="/basic2", method=RequestMethod.POST)//<-post형식만 받아서옴 
	public void basic2 () {
		System.out.println("bacis2화면 요청");
	}
	
	//basic3 (getmapping)  3,4 메서드에서만 사용가능 
	@GetMapping("/basic3")
	public void basic3() {
		System.out.println("bacis3화면 요청");
	}
	
	//basic4(postMapping)
	@PostMapping("/basic4")
	public void basic4() {
		System.out.println("bacis4화면 요청");
	}
	
//	//동일 요청을 맴핑하나로 처리하고 싶다면 {} 경로를 묶어주면 됩니다.
//	@RequestMapping({"/basic1","/basic2","/basic3"})
//	public void view() {
//		System.out.println("실행됨..");
//	}
	
	//------------요청파라미터 받기 ----------------
	//req_ex02.화면 처리 
	@RequestMapping("/req_ex02")
	public String req_ex02() {
		
		return "request/req_ex02"; //"보여줄 화면 ";
	}
	
	//param1 요청 처리
	/*//1nd 방식
	 * @RequestMapping(value="/param1", method= RequestMethod.POST) public String
	 * param1(HttpServletRequest request) {
	 * System.out.println(request.getParameter("id")); return
	 * "request/req_ex02_result"; }
	 */
	
	//2nd 방식
	
	  @RequestMapping("/param1") public String param1(@RequestParam("id") String id,	  
			  							@RequestParam("pw") String pw,
	  
			  							@RequestParam("name") String name,
	  
			  							@RequestParam("age") String age,
			  							
			  							@RequestParam(value = "inter", required = false, defaultValue = "") ArrayList<String> inter
	  
			  ) { System.out.println(id);
			  //필수가 아닌 파라미터는 required = false 속성을 지정하면 됩니다.
			  //필수가 아닌 파라미터일 경우 null값을 지정하게 되는데 기본값의 설정으로  defaultvalue 옵셕능ㄹ 사용하면 됩니다.
			  	System.out.println(inter.toString());
	  return "request/req_ex02_result"; }
	 
	
	//3nd
//	@RequestMapping("/param1")
//	public String param1(ReqVO vo) {
//		
//		System.out.println(vo.getId());
//		System.out.println(vo.getPw());
//		System.out.println(vo.getName());
//		System.out.println(vo.getAge());
//		System.out.println(vo.getInter().toString());//다중값으 처리 
//		return "request/req_ex02_result";
//	}
	  
	  
	  
	  
//	  @RequestMapping("/login")
//		public String login(ReqVO vo ) {
//		
//			
//			if(vo.getId().equals("abc123") && vo.getPw().equals("xxx123")) {
//			
//			return "request/req_ex02_result";
//			}else {
//				return "request/req_ex02_fail";
//			}
//			
//		}
	
	  @RequestMapping("/req_quiz01")
	  public String req_quiz01() {
		  return "/request/req_quiz01";
	  }
	  
	  @RequestMapping("/login")
		public String login(ReqVO vo ) {
		
			
			if(vo.getId().equals("abc123") && vo.getPw().equals("xxx123")) {
			
			return "request/req_ex02_result";
			}else {
				return "request/req_ex02_fail";
			}
			
		}
}







