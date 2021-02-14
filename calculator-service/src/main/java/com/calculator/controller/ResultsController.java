package com.calculator.controller;

import com.calculator.domain.MultiplicationRequest;
import com.calculator.domain.MultiplicationResponse;
import com.calculator.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.calculator.controller.ResultsController.RESULTS_PATH;

@RestController
@RequestMapping(RESULTS_PATH)
public class ResultsController {

	public static final String RESULTS_PATH = "/results";

	@Autowired
	private MultiplicationService multiplicationService;

	@PostMapping
	@ResponseBody
	public ResponseEntity<MultiplicationResponse> postResult(@RequestBody MultiplicationRequest resultAttempt) {
		return new ResponseEntity<MultiplicationResponse>(
				new MultiplicationResponse(multiplicationService.checkResultRequest(resultAttempt)), HttpStatus.OK);
	}

}
