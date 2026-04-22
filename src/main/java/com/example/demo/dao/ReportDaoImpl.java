package com.example.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDaoImpl implements ReportDao{
	
	public ReportDaoImpl() {
		System.out.println("ReportDaoImpl::Constructor");
	}

	@Override
	public String getReportData() {
		System.out.println("Report generation in db...");
		return "data fetched";
	}

}
