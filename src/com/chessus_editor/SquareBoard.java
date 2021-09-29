package com.chessus_editor;

public class SquareBoard implements GameBoard {
	
	private BoardService boardService;
	
	public SquareBoard () {
		
	}

	public SquareBoard(BoardService boardService) {
		this.boardService = boardService;
	}

	@Override
	public String getSquareCount() {
		return "This is a square board (25 squares)";
	}

	@Override
	public String getXWidth() {
		// TODO Auto-generated method stub
		return "new X Width - 5 squares!";
	}

}
