package com.simple.basic;

import java.sql.Connection;

import javax.activation.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


//@RunWith(SpringJUnit4ClassRunner.class)//스프링 프레인워크에서 독립적으로 테스트 환경을 가동
//@Configuration("file:src/main/webapp/WEB-INF/config/root-context.xml")//해당 파일을 스프링 설정 파일로 적용
//public class JDBCHikari {
//	@Autowired
//	DataSource dataSource;
//	
//	@Test
//	public void test() {
//		try {
//			Connection conn= dataSource.getConnection();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
