package com.example.incubyte_tdd_calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class IncubyteTddCalculatorApplicationTests {

	@Test
	public void should_return_0_for_empty_string() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(0, calculator.add(""));
	}

	@Test
	public void should_return_number_for_single_number() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(1, calculator.add("1"));
		assertEquals(5, calculator.add("5"));
	}



}
