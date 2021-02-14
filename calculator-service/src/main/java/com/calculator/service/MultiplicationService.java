package com.calculator.service;

import com.calculator.domain.Multiplication;
import com.calculator.domain.MultiplicationRequest;

public interface MultiplicationService {

	/**
	 * Creates a Multiplication object with two randomly-generated factors
	 * between 11 and 99.
	 *
	 * @return a Multiplication object with random factors
	 */
	Multiplication createRandomMultiplication();

	/**
	 * @return true if the attempt matches the result of the
	 *         multiplication, false otherwise.
	 */
	boolean checkResultRequest(final MultiplicationRequest multiplicationRequest);

}
