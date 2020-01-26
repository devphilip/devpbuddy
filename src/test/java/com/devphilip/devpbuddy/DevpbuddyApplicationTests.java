package com.devphilip.devpbuddy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.devphilip.devpbuddy.web.i18n.I18NService;

@SpringBootTest
class DevpbuddyApplicationTests {
	
	@Autowired
	private I18NService I18NService;
	
	@Test
	public void testMessageByLocalService() throws Exception {
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = I18NService.getMessage(messageId);
		assertEquals(expectedResult, actual, "The actual and expected String don't match");
	}

}
