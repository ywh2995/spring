package com.simple.basic;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml")

public class JDBCHikari {

	//커넥션풀 확인
	@Autowired
	DataSource dataSource;
	
	//스프링 jdbc확인
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Test
	public void test() {
		
		try {
			Connection conn = dataSource.getConnection();
			System.out.println("결과확인:" + conn);
			
			System.out.println("스프링 JDBC 결과확인:" + jdbcTemplate);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
