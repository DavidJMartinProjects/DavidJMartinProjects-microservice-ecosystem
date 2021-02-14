package com.calculator.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomNumberServiceImpl implements RandomNumberService {

	private final static int MIN_RANGE = 11;
	private final static int MAX_RANGE = 99;

	@Override
	public int generate() {
		return new Random().nextInt((MAX_RANGE - MIN_RANGE) + 1) + MIN_RANGE;
	}

}
