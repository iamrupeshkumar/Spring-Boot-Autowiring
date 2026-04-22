package com.example.demo.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class ReportDaoOracleImpl implements ReportDao{
	
	public ReportDaoOracleImpl() {
		System.out.println("ReportDaoOracleImpl::Constructor");
	}

	@Override
	public String getReportData() {
		System.out.println("Report generation in oracle db...");
		return "data fetched";
	}

}
