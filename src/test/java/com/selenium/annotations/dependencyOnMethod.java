package com.selenium.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyOnMethod {
	
	@Test(priority=1)
	public void testLogin(){
		//Assert.assertEquals("A", "B");
		System.out.println("Login Test");
		
	}
	
	@Test(priority=2,dependsOnMethods={"testLogin"})
	public void testChangePassword(){
		System.out.println("Password change Test");
		
	}
	
	@Test(priority=3,dependsOnMethods={"testLogin","testChangePassword"})
	public void logout(){
		System.out.println("Logout test");
		
	}

}
