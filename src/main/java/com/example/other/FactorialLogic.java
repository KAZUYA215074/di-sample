package com.example.other;

import org.springframework.stereotype.Component;

@Component
public class FactorialLogic {

	public int factorialLogical(int num) {

		int answer = 1;

		for (int i = 1; i <= num; i++) {
			answer = answer * i;
		}

		return answer;
	}
}
