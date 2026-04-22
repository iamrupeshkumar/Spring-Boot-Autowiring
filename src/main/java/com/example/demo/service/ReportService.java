package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ReportDao;

@Service
public class ReportService {
	
	private ReportDao reportDao;
	
	@Autowired
	public void setReportDao(ReportDao reportDao) {
		this.reportDao = reportDao;
	}
	
	
	public void getGeneratedReport() {
		reportDao.getReportData();
		System.out.println("Generating report....");
	}

}
