package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.TestData;

@RestController
public class ExampleController {
	@PostMapping("/getExample")
	public String getExample(@RequestBody TestData data) {
		System.out.println(data.isCheck());
		return data.getData();
	}
}
