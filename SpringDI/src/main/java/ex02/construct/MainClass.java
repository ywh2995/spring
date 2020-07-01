package ex02.construct;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//Hotel클래스 생성 chef를 확인
//		Chef c = new Chef();
//		Hotel h = new Hotel(c);
//		
//		h.getChef().cook();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
		
		Hotel h = ctx.getBean(Hotel.class);
		h.getChef().cook();
	}
}
