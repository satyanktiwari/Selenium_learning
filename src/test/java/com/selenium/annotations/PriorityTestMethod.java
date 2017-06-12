package com.selenium.annotations;

import org.testng.annotations.Test;

public class PriorityTestMethod {
	
	@Test(priority=1)
	public void testLogin(){
		//Assert.assertEquals("A", "B");
		System.out.println("Login Test");
		
	}
	
	@Test(priority=2)
	public void testChangePassword(){
		System.out.println("Password change Test");
		
	}
	
	@Test(priority=3)
	public void logout(){
		System.out.println("Logout test");
		
	}

}
