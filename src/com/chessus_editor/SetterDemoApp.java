package com.chessus_editor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		
		UniqueBoard theBoard = context.getBean("myUniqueBoard", UniqueBoard.class);
		
		// call methods on the bean
		System.out.println(theBoard.getSquareCount());
		System.out.println(theBoard.getXWidth());
		
		// close the context
		context.close();

	}

}
