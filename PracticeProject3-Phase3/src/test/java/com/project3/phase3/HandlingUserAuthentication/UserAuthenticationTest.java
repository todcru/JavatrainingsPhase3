package com.project3.phase3.HandlingUserAuthentication;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserAuthenticationTest {
	private UserAuthentication Auth;
	@BeforeEach
	public void setup() {
		Auth=new UserAuthentication();
		System.out.println("Object initialized");
	}
	@Test
	public void verifyUserName() {
		assertEquals(Auth.getUserName(), "Aswin");
	}
	@Test
	public void verifyEmail() {
		assertEquals(Auth.getEmail(), "aswin@gmail.com");
	}
	@Test
	public void verifyPhnNum() {
		assertEquals(Auth.getPhnNum(), 989898989);
	}
	@Test
	public void verifyPassword() {
		assertEquals(Auth.getPassword(), "@123");
	}
	@AfterEach
	public void tearDown() {
		Auth=null;
		System.out.println("Object destroyed");
	}
}