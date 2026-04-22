package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.ReportDaoImpl;
import com.example.demo.service.ReportService;

@SpringBootApplication
public class SpringBootAutowiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAutowiringApplication.class, args);
		ReportService serviceBean = context.getBean(ReportService.class);
		//ReportDaoImpl daoBean = context.getBean(ReportDaoImpl.class);
		//serviceBean.setReportDao(daoBean);
		serviceBean.getGeneratedReport();
		
	}

}
