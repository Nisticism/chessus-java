package com.chessus_editor;

public class ChessusMainApp {

	public static void main(String[] args) {

		GameBoard theBoard = new SquareBoard();
		System.out.println(theBoard.getSquareCount());
	}

}
