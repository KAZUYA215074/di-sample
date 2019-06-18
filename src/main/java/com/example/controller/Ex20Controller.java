package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.other.FactorialLogic;

@Controller
@RequestMapping("/factoria")
public class Ex20Controller {

	@Autowired
	private FactorialLogic factorialLogic;

	@RequestMapping("/view-result")
	public String result(Model model) {
		int num = 5;
		int answer = factorialLogic.factorialLogical(num);
		
		System.out.println(num + "!=" + answer);
		
		model.addAttribute("num",num);
		model.addAttribute("answer",answer);
		
		return "finished";
	}
}
