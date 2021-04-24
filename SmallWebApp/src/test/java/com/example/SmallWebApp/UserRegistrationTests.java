package com.example.SmallWebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserRegistrationTests {

	@Test
	void testGetSet() {
		UserRegistration ur = new UserRegistration();
		
		String name = "soumitra";
		String mail = "test@persistent.com";
		String pass = "qwerty";
		String phone = "9876543210";
		
		ur.setUName(name);
		ur.setPhone(phone);
		ur.setEmailId(mail);
		ur.setPassword(pass);
		
		String UName = ur.getUName();
		String EmailId = ur.getEmailId();
		String Password = ur.getPassword();
		String Phone = ur.getPhone();

		assertEquals(name, UName);
		assertEquals(mail, EmailId);
		assertEquals(phone, Phone);
		assertEquals(pass, Password);
	}

}
