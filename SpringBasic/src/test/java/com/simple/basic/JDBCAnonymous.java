package com.simple.basic;

import org.junit.Test;

interface Car {
	public void run();
	
}



public class JDBCAnonymous {

	@Test
	public void test() {
		Car car = new Car(){
			@Override
			public void run() {
			System.out.println("결과");
				
			}
		};
		car.run(); 
		// 익명 클래스 기법
		//보통 경우에는 별도 클래스를 생성해서 쓰지만 , 재사용 할 일이 없는 1회성 클래스는 빠르게 생성해서 사용 합니다/
		
	}
}
