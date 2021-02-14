package com.calculator.service;

import com.calculator.domain.Multiplication;
import com.calculator.domain.MultiplicationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {

	@Autowired
	RandomNumberService randomNumber;

	@Override
	public Multiplication createRandomMultiplication() {
		int num1 = randomNumber.generate();
		int num2 = randomNumber.generate();
		return new Multiplication(num1, num2);
	}

	@Override
	public boolean checkResultRequest(final MultiplicationRequest multiplicationRequest) {
		return multiplicationRequest.getResultAttempt() ==
				multiplicationRequest.getMultiplication().getNum1() *
				multiplicationRequest.getMultiplication().getNum2();
	}

}
