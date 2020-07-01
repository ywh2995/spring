package ex08.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex01.SpringTest;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		SpringTest t = ctx.getBean(SpringTest.class);
		t.test();
	}
}
