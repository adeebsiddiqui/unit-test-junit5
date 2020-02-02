package com.ad.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	public void tearDown() throws Exception {
		calculator = null;
	}

	@Test
	public void add_ShouldReturnCorrectSummationResult_WhenInputIsTwoNumbers() { //<method>_Should<expected>_When<condition>
		assertEquals(8, calculator.add(5, 3));
	}

	@Test
	public void subtract_ShouldReturnCorrectSubtractionResult_WhenInputIsTwoNumbers() {
		assertEquals(3, calculator.subtract(8, 5));
	}

	@Test
	public void multiply_ShouldReturnCorrectMultiplicationResult_WhenInputIsTwoNumbers() {
		assertEquals(15, calculator.multiply(5, 3));
	}

	@Test
	public void division_ShouldReturnCorrectDivisionResult_WhenInputIsTwoNumbers() {
		assertEquals(5, calculator.divide(15, 3));
	}

	@Test
	public void square_ShouldReturnCorrectSquareOfNumber_WhenInputNumberProvided() { //<method>_Should<expected>_When<condition>
		assertEquals(25, calculator.square(5));
	}

	@Test
	public void square_ShouldReturnIncorrectSquareOfNumber_WhenInputNumberProvided() {
		assertNotEquals(20, calculator.square(5));
	}

	@Test
	public void cube_ShouldReturnCorrectCubeOfNumber_WhenInputNumberProvided() {
		assertEquals(27, calculator.cube(3));
	}

	@Test
	public void cube_ShouldReturnIncorrectCubeOfNumber_WhenInputNumberProvided() {
		assertNotEquals(20, calculator.cube(3));
	}
}
