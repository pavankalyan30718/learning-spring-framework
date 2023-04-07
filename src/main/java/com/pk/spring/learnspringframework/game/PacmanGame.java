package com.pk.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{

	public void up()
	{
		System.out.println("Pacman UP");
	}
	public void down()
	{
		System.out.println("Pacman DOWN");
	}
	public void left()
	{
		System.out.println("Pacman LEFT");
	}
	public void right()
	{
		System.out.println("Pacman RIGHT");
	}
}
