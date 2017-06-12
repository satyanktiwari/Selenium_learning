package com.selenium.annotations;

import org.testng.annotations.Test;

public class OnlyTestMethod {
	
	@Test()
	public void testLogin(){
		//Assert.assertEquals("A", "B");
		System.out.println("Login Test");
		
	}
	
	@Test()
	public void testChangePassword(){
		System.out.println("Password change Test");
		
	}
	
	@Test()
	public void logout(){
		System.out.println("Logout test");
		
	}

}
