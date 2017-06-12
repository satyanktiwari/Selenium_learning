package com.selenium.annotations;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipTest {
	
	@Test(priority=1)
	public void testLogin(){
		if(!isLogin())
			throw new SkipException("Not yet logged in");
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
	
	public boolean isLogin(){
		return false;
	}

}
