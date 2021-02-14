package com.calculator.domain;

import lombok.Data;

/**
 * This class represents a Multiplication (a * b).
 */
@Data
public class Multiplication {

	private int num1;
	private int num2;
	private int result;

	public Multiplication(final int num1, final int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.result = num1 * num2;
	}

}
