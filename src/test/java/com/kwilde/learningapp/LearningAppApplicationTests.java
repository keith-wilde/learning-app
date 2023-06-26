package com.kwilde.learningapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import strings.PocKt; //importing from kotlin

@SpringBootTest
class LearningAppApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(PocKt.lastChar("stuff"));
	}

}
