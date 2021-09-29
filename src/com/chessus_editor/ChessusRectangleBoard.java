package com.chessus_editor;

public class ChessusRectangleBoard implements GameBoard {
	
	// define a private field for the dependency
	private BoardService boardService;
	
	// define a constructor for dependency injection
	public ChessusRectangleBoard(BoardService theBoardService) {
		boardService = theBoardService;
	}

	@Override
	public String getSquareCount() {
		return "lots of squares (5 x 7 = 35!)";
	}

	@Override
	public String getXWidth() {
		
		// use my boardService to get a board
		
		return boardService.getXWidth();
	}
}
