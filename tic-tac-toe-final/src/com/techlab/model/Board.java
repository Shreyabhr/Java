package com.techlab.model;


import java.util.ArrayList;

public class Board implements IBoard{
	
	private ArrayList<Cell> board;
	private int boardSize;
	
	public Board(int size) {
		this.boardSize = size;
		this.board = new ArrayList<Cell>();
		for(int i = 0; i < boardSize * boardSize ; i++) {
			board.add(new Cell());
		}
	}
	
	@Override
	public ArrayList<Cell> getBoard() {
		return this.board;
	}
	
	@Override
	public int getSize() {
		return boardSize;
	}
	
	@Override
	public void markCell(int index, Mark mark) throws CellAlreadyMarkedException {
		board.get(index).setMark(mark);
	}
	
	
	@Override
	public boolean check_if_board_is_full() {
		for(Cell cells : board) {
			if(cells.getMark().equals(Mark.EMPTY)) {
				return false;
			}
		}
		return true;
	}

}
