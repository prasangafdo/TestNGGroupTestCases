package com.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeClass
	public void initiateTest() {
		Assert.assertEquals("test", "test");
	}
	@Test (priority =1, groups = {"smoke", "Performance"})
	public void openPage() {
		Assert.assertEquals("test", "test");
	}
	@Test (priority =2, groups = {"smoke", "Performance"})
	public void login() {
		Assert.assertEquals("test", "test");
	}
	@Test (priority =3, groups = {"smoke", "Performance"})
	public void addNewUser() {
		Assert.assertEquals("test", "test");
	}
	@Test (priority =4, groups = {"Performance"})
	public void viewUsers() {
		Assert.assertEquals("test", "test");
	}
	@Test (priority =5, groups = {"Performance"})
	public void removeExistingUser() {
		Assert.assertEquals("test", "test");
	}
	@Test (priority =6, groups = {"smoke", "Performance"})
	public void Logout() {
		Assert.assertEquals("test", "test");
	}
  
}
