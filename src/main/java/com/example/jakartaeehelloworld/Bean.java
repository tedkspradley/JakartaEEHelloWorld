package com.example.jakartaeehelloworld;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Bean
{
	private String input;
	private String output;

	@PostConstruct
	public void init()
	{
		System.out.println("View intialized");
	}

	public void submit()
	{
		output = "Hello World! You have typed: " + input;
	}

	public String getInput()
	{
		return input;
	}

	public void setInput(String input)
	{
		this.input = input;
	}

	public String getOutput()
	{
		return output;
	}
}
