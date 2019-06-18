package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.other.CalcLogic;

@Controller
@RequestMapping("/calc")
public class CalcController {

	@Autowired
	private CalcLogic calcLogic;

	@RequestMapping("/add")
	public String add() {
		int num1 = 21;
		int num2 = 3;

		int resultOfAdd = calcLogic.add(num1, num2);
		int resultOfSub = calcLogic.sub(num1, num2);
		int resultOfMulti = calcLogic.multi(num1, num2);
		int resultOfDiv = calcLogic.div(num1, num2);

		System.out.println(num1 + "+" + num2 + "=" + resultOfAdd);
		System.out.println(num1 + "-" + num2 + "=" + resultOfSub);
		System.out.println(num1 + "*" + num2 + "=" + resultOfMulti);
		System.out.println(num1 + "÷" + num2 + "=" + resultOfDiv);
		
		return "finished";
	}
}
