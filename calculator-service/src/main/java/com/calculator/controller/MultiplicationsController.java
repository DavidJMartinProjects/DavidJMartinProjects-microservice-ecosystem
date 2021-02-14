package com.calculator.controller;

import com.calculator.domain.Multiplication;
import com.calculator.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.calculator.controller.MultiplicationsController.MULTIPLICATIONS_PATH;

@RestController
@RequestMapping(MULTIPLICATIONS_PATH)
public class MultiplicationsController {

	public static final String MULTIPLICATIONS_PATH = "/multiplications";

	@Autowired
	private MultiplicationService multiplicationService;

	@GetMapping
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public Multiplication getMultiplication() {
		return multiplicationService.createRandomMultiplication();
	}

}
