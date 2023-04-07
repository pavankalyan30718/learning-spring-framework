package com.pk.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole{
  
	public void up()
	{
		System.out.println("SuperContra UP");
	}
	public void down()
	{
		System.out.println("SuperContra DOWN");
	}
	public void left()
	{
		System.out.println("SuperContra LEFT");
	}
	public void right()
	{
		System.out.println("SuperContra RIGHT");
	}
}
