package com.selenium.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	private SoftAssert softAssert = new SoftAssert();
	
	//@Test
	public void testGoogleSearch(){
		// open google.com
		String expected_title="Google";
		String acual_title="Google"; //  selenium
		System.out.println("before assertion");
		
			Assert.assertEquals(expected_title, acual_title);
		
		System.out.println("After assertion");
		
		Assert.assertTrue(4>13, "Error coming because of xyz reason");
	}
	
	@Test
	public void multipleAssersion(){
		// open google.com
		String expected_title="Google";
		String acual_title="Google"; //  selenium
		System.out.println("before assertion");
		
		softAssert.assertEquals(expected_title, acual_title);
		
		System.out.println("After assertEquals");
		
		softAssert.assertTrue(4>13, "Error coming because of xyz reason");
		
		System.out.println("After assertTrue");
		
		softAssert.assertAll();
	}

}
