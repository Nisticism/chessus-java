package com.chessus_editor;

public class UniqueBoard implements GameBoard {
	
	private BoardService boardService;
	
	// create a no-arg constructor
	public UniqueBoard() {
		System.out.println("UniqueBoard: inside no-arg constructor");
	}
	
	// our setter method
	public void setBoardService(BoardService boardService) {
		System.out.println("UniqueBoard: inside setter method - setBoardService");
		this.boardService = boardService;
	}

	@Override
	public String getSquareCount() {
		return "A unique square count!";
	}

	@Override
	public String getXWidth() {
		return boardService.getXWidth();
	}

}
