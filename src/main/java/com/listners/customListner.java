package com.listners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class customListner extends TestListenerAdapter{
	
	
	public void onTestFailure(ITestResult tr){
		System.out.println("Report custom Failure->"+ tr.getName());
	}
	
	public void onTestSuccess(ITestResult tr){
		System.out.println("Report custom success->"+tr.getName());
	}

}
