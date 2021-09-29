package com.chessus_editor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChessusApp {

	public static void main(String[] args) {
		
		// load spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		GameBoard currentBoard = context.getBean("currentBoard", GameBoard.class);
		
		// call methods on the bean
		System.out.println(currentBoard.getSquareCount());
		
		// let's call our new method for services
		System.out.println(currentBoard.getXWidth());
		
		// close the context
		context.close();

	}

}
