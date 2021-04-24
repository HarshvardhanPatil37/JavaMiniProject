package com.example.SmallWebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserLoginTests {

	@Test
	void testGetSet() {
		UserLogin ul = new UserLogin();
		
		String mail = "test@gmail";
		String pass = "qwerty";
		ul.setUEmail(mail);
		ul.setPassword(pass);
		
		String UEmail = ul.getUEmail();
		String Password = ul.getPassword();

		assertEquals(mail, UEmail);
		assertEquals(pass, Password);
	}

}
