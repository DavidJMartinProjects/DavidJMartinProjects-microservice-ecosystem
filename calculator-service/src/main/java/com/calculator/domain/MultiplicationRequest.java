package com.calculator.domain;


import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Identifies the attempt from a {@link User} to solve a
 * {@link Multiplication}.
 */

@Data
@RequiredArgsConstructor
public final class MultiplicationRequest {

	private User user;
	private Multiplication multiplication;
	private int resultAttempt;

}