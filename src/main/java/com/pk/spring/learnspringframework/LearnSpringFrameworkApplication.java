package com.pk.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.pk.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.pk.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
@ComponentScan("com.pk.spring.learnspringframework")
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		//MarioGame game = new MarioGame();
		//PacmanGame game = new PacmanGame();
		//SuperContraGame game = new SuperContraGame();
		
		//GamingConsole game = new MarioGame();
		//GameRunner runner = new GameRunner(game);
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
		}

}
