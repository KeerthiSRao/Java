package com.snake.run;
import com.snake.Snake;
public class SnakeRunner {

	public static void main(String[] args) {

		Snake snake1=new Snake("Indian Cobra",5,"Cobra");
		Snake snake2=new Snake("Russel's Viper",6,"Viper");
		Snake snake3=new Snake("Common kriat",7,"Kriat");

		Snake[] snakes=new Snake[3];
		
		snakes[0]=snake1;
		snakes[1]=snake2;
		snakes[2]=snake3;
		
		for(Snake snakeDetails:snakes)
		{
			System.out.println(snakeDetails);
			snakeDetails.mudrana();
		}

	}

}
