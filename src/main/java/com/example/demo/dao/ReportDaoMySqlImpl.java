package com.example.demo.dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class ReportDaoMySqlImpl implements ReportDao{
	
	public ReportDaoMySqlImpl() {
		System.out.println("ReportDaoMySqlImpl::Constructor");
	}

	@Override
	public String getReportData() {
		System.out.println("Report generation in my sql db...");
		return "data fetched";
	}

}
